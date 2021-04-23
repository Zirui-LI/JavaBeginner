
public class LinkedCircularQueue<E> extends LinkedQueue<E> implements CircularQueue<E> {
	CircularlyLinkedList<E> list = new CircularlyLinkedList<E>();
	public void rotate() {
		list.rotate();
	}
}
