
public class SinglyLinkedList<E> {
	
	//Nested class Node
	private static class Node<E> {
		private E element;
		private Node<E> next;
		public Node(E e, Node<E> n) {
			element = e;
			next = n;
		}
	public E getElement() { return element; }
	public Node<E> getNext() { return next; }
	public void setNext(Node<E> n) { next = n; }
	}
	// instance variables
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	public SinglyLinkedList() {}
	// access methods
	public int size() { return size; }
	public boolean isEmpty() { return size == 0; }
	public E first() {
		if(isEmpty()) return null;
		return head.getElement();
	}
	public E last() {
		if(isEmpty()) return null;
		return tail.getElement();
	}
	// update methods
	public void addFirst(E e) {
		head = new Node<>(e, head);
		if(size == 0) tail = head;
		size++;
	}
	public void addLast(E e) {
		Node<E> newest = new Node<>(e, null);
		if(isEmpty()) head = newest;
		else tail.setNext(newest);
		tail = newest;
		size++;
	}
	public E removeFirst() {
		if(isEmpty()) return null;
		E answer = head.getElement();
		head = head.getNext();
		size--;
		if(size == 0) tail = null;
		return answer;
	}
	
	// equals
	public boolean equals(Object o) {
		if(o == null) return false;
		if(getClass() != o.getClass()) return false;
		SinglyLinkedList other = (SinglyLinkedList) o;
		if (size != other.size) return false;
		Node walkA = head;
		Node walkB = other.head;
		while(walkA != null) {
			if(!walkA.getElement().equals(walkB.getElement())) return false;
			walkA = walkA.getNext();
			walkB = walkB.getNext();
		}
		return true;
	}
	
	//clone
	
	public SinglyLinkedList<E> clone() throws CloneNotSupportedException {
		// always use inherited Object.clone() to create the initial copy
		SinglyLinkedList<E> other = (SinglyLinkedList<E>) super.clone();
		if(size > 0) {
			other.head = new Node<>(head.getElement(), null);
			Node<E> walk = head.getNext();
			Node<E> otherTail = other.head;
			while(walk != null) {
				Node<E> newest = new Node<>(walk.getElement(), null);
				otherTail.setNext(newest);
				otherTail = newest;
				walk = walk.getNext();
			}
		}
		return other;
	}
	
	public E FindSecondToLast() {
		Node<E> last = null; 
		Node<E> walk = head;
		while(walk.getNext() != null) {
			last = walk;
			walk = walk.getNext();
		}
		return last.getElement();
	}
	
	public void PrintSinglyLinkedList() {
		Node<E> walk = head;
		while(walk != null) {
			System.out.print(walk.getElement()+" -> ");
			walk = walk.getNext();
		}
		System.out.println("NULL");
		
	}
	public int getSize() {
		if(isEmpty()) return 0;
		int size = 1;
		Node<E> walk = head;
		while(walk.getNext() != null) {
			size++;
			walk = walk.getNext();
		}
		return size;
	}
	
	public void rotate() {
		Node<E> temp = head;
		head = head.getNext();
		temp.setNext(null);
		tail.setNext(temp);
		tail = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SinglyLinkedList<Integer> sll = new SinglyLinkedList<Integer>();
		Integer a = Integer.valueOf(1);
		Integer b = Integer.valueOf(2);
		sll.addLast(a);
		sll.addLast(b);
		Integer c = Integer.valueOf(3);
		sll.addLast(c);
		sll.PrintSinglyLinkedList();
		sll.rotate();
		sll.PrintSinglyLinkedList();
		System.out.println(sll.FindSecondToLast());
		System.out.println(sll.getSize());
	}

}
