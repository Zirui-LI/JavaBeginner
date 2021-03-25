import java.util.Scanner;

public class Task1_5 {
	public static void main(String [] args) {
		System.out.println("Please enter an integer: ");
		Scanner input = new Scanner(System.in);
		int a = 0;
		a = input.nextInt();
		System.out.println(nSum(a));
	}
	public static int nSum(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
}
