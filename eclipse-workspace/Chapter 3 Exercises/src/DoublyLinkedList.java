

public class DoublyLinkedList<E> {
	private static class Node<E> {
		private E element;
		private Node<E> next;
		private Node <E> prev;
		public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
		}
	public E getElement() { return element; }
	public Node<E> getPrev() { return prev; }
	public Node<E> getNext() { return next; }
	public void setPrev(Node<E> p) { prev = p; }
	public void setNext(Node<E> n) { next = n; }
	}
	
	private Node<E> trailer = null;
	private Node<E> header = null;
	private int size = 0;
	public DoublyLinkedList() {
		header = new Node<> (null, null, null);
		trailer = new Node<> (null, header, null);
		header.setNext(trailer);
	}
	
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }
	public E last() {
		if(isEmpty()) return null;
		return trailer.getPrev().getElement();
	}
	public E first() {
		if(isEmpty()) return null;
		return header.getNext().getElement();
	}
	

	public void addFirst(E e) {
		addBetween(e, header, header.getNext());
	}
	
	public void addLast(E e) {
		addBetween(e, trailer.getPrev(), trailer);
	}
	
	public E removeFirst() {
		if (isEmpty()) return null;
		return remove(header.getNext());
	}
	
	public E removeLast() {
		if (isEmpty()) return null;
		return remove(trailer.getPrev());
	}
	public void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		Node<E> newest = new Node<>(e, predecessor, successor);
		predecessor.setNext(newest);
		successor.setPrev(newest);
		size++;
	}
	private E remove(Node<E> node) {
		Node<E> predecessor = node.getPrev();
		Node<E> successor = node.getNext();
		predecessor.setNext(successor);
		successor.setPrev(predecessor);
		size--;
		return node.getElement(); 
	}
	private E findMiddle() {
		if(isEmpty()) return null;
		Node<E> walk1 = header.getNext();
		Node<E> walk2 = trailer.getPrev();
		
		while(walk1 != walk2 && walk1.getNext() != walk2) {
			walk1 = walk1.getNext();
			walk2 = walk2.getPrev();
		}
		return walk1.getElement();
	}
	
	public int getSize() {
		if(isEmpty()) return 0;
		int size = 1;
		Node<E> walk = header.getNext();
		while(walk.getNext() != trailer) {
			size++;
			walk = walk.getNext();
		}
		return size;
	}
	
	public boolean equals(Object o) {
		if(o == null) return false;
		if(getClass() != o.getClass()) return false;
		DoublyLinkedList<E> other = (DoublyLinkedList<E>) o;
		if(size() != other.size()) return false;
		if(size() == 0 && other.size() == 0) return true;
		Node<E> walk1 = header.getNext();
		Node<E> walk2 = other.header.getNext();
		while(walk1 != trailer) {	
			if(!walk1.getElement().equals(walk2.getElement())) return false;
			walk1 = walk1.getNext();
			walk2 = walk2.getNext();
		}	
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList<Integer> dll = new DoublyLinkedList<Integer>();
		dll.addFirst(1);
		dll.addLast(2);
		dll.addLast(3);
		dll.addLast(4);
		dll.addLast(5);
		dll.addLast(6);
		DoublyLinkedList<Integer> dll1 = new DoublyLinkedList<Integer>();
		dll1.addFirst(1);
		dll1.addLast(2);
		dll1.addLast(3);
		dll1.addLast(4);
		dll1.addLast(5);
		dll1.addLast(6);
		System.out.println(dll.findMiddle());
		System.out.println(dll.getSize());
		System.out.println(dll.equals(dll1));
	}

}
