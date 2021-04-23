import java.util.*;

public class useOfStack {
	/**
	 * Reverses the input array.
	 * @param <E>  the type of object in the array.
	 * @param  a an array that you want to reverse.
	 */
	public static <E> void reverse(E[] a) {
		Stack<E> buffer = new ArrayStack<>(a.length);
		for (int i = 0; i < a.length; i++)
			buffer.push(a[i]);
		for (int i=0; i < a.length; i++)
			a[i] = buffer.pop();
	}
	
	/**
	 * Tests whether the delimiters in the string match up correctly.
	 * @param expression the string to be tested
	 * @return true if the delimiters match up correctly, false otherwise
	 */
	
	public static boolean isMatched(String expression) {
		final String opening = "({[";
		final String closing = ")}]";
		Stack<Character> buffer = new LinkedStack<>();
		for (char c : expression.toCharArray()) {
			if (opening.indexOf(c) != -1)
				buffer.push(c);
			else if (closing.indexOf(c) != -1) {
				if (buffer.isEmpty())
					return false;
				if (closing.indexOf(c) != opening.indexOf(buffer.pop()))
					return false;
			}
		}
		return buffer.isEmpty();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[ ] a = {4, 8, 15, 16, 23, 42}; // autoboxing allows this 
		String[ ] s = {"Jack", "Kate", "Hurley", "Jin", "Michael"}; 
		System.out.println("a = " + Arrays.toString(a)); 
		System.out.println("s = " + Arrays.toString(s)); 
		System.out.println("Reversing...");
		reverse(a);
		reverse(s);
		System.out.println("a = " + Arrays.toString(a)); 
		System.out.println("s = " + Arrays.toString(s));
	}
	

	
	
}
