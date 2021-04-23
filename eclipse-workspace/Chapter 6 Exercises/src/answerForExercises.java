import java.util.*;

public class answerForExercises<E> {
	/** 
	 * Ex 6.4
	 *
	 */
	public static void transfer(ArrayStack S, ArrayStack T) {
		while(S.top() != null) {
			T.push(S.pop());
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayStack<Integer> S = new ArrayStack();
		S.push(1);
		S.push(3);
		S.push(5);
		ArrayStack<Integer> T = new ArrayStack();
		T.push(2);
		T.push(4);
		T.push(6);
		transfer(S, T);
		
//		while(T.top() != null) {
//			System.out.print(T.pop() + "  ");
//		}
		
		System.out.println(T.size());
		T.removeAllRecursive();
		System.out.println(T.size());
		
	}

}
