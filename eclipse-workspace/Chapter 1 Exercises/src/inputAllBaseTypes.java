import java.util.Scanner;

public class inputAllBaseTypes {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("please enter an integer: ");
		while(!input.hasNextInt()) {
			System.out.print("Wrong value type, please enter an integer: ");
			input.nextLine();
		}
		int a = input.nextInt();
		System.out.println(a);
		
		System.out.print("please enter an double: ");
		while(!input.hasNextDouble()) {
			System.out.print("Wrong value type, please enter an integer: ");
			input.nextLine();
		}
		double b = input.nextDouble();
		System.out.println(b);
	}
}
