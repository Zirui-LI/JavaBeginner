
public class ArithmeticProgression extends Progression{
	protected long increment;
	public ArithmeticProgression () {
		this(0, 1);
	}
	public ArithmeticProgression (long incre) {
		this(0, incre);
	}
	public ArithmeticProgression (long start, long incre) {
		super(start);
		increment = incre;
	}
	
	protected void advance() {
		current += increment;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Progression pro2 = new ArithmeticProgression(2, 4);
		pro2.printProgression(10);
		Progression pro3 = new ArithmeticProgression(3);
		pro3.printProgression(10);
		Progression pro4 = new ArithmeticProgression(128);
		pro4.printProgression(10);
	}

}

//Read it
//ship it
//Buy it
//Read it
//Buy it
//Buy it