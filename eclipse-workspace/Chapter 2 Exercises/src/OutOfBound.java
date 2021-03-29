import java.util.Scanner;

public class OutOfBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer [] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		try {
			Scanner input = new Scanner(System.in);
			int index = input.nextInt();
			input.close();
			System.out.print(array[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("the number you enter is out of boundary,"
					+ " using default");
			System.out.print(array[0]);
		}
		
		
	}
	
	
}
