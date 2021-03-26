
public class FibonacciProgression extends Progression {
	protected long prev;
	
	public FibonacciProgression() {
		this(0, 1);
	}
	
	public FibonacciProgression(long first, long second) {
		super(first);
		prev = second - first;
	}
	
	public void advance() {
		long temp = prev;
		prev = current;
		current += temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciProgression FiboPro = new FibonacciProgression(2, 3);
		FiboPro.printProgression(10);
	}
}
