
public class FactorialFunction {
	public static int Factorial(int n) throws IllegalArgumentException{
		if(n < 0) throw new IllegalArgumentException("Negative Integer");
		if(n == 0) return 1;
		else return Factorial(n-1)*n;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Factorial(5));
	}

}
