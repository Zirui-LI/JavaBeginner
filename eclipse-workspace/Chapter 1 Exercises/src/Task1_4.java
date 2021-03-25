//WriteashortJavamethod,isEven,that takes an int i and returns true if and only if i is even. 
//Your method cannot use the multiplication, modulus, or division operators, however.
import java.util.Scanner;

public class Task1_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner input = new Scanner(System.in);
		System.out.println("please enter an integer, enter 'quit' to stop");
		while(!input.hasNextInt()) {
			System.out.println("Wrong value type! Please enter an integer: ");
			input.nextLine();
		}
		a = input.nextInt();
		System.out.println(isEven(a));
	}
	
	public static boolean isEven(int i) {
//		Integer iWrapper = i;
//		String iStr = iWrapper.toString();
		String iStr = String.valueOf(i);
		int iLast = iStr.charAt(iStr.length() - 1);
		while (iLast > 0) {
			iLast -= 2;
		}
		if (iLast == 0) {
			return true;}
		return false;
	}
}
