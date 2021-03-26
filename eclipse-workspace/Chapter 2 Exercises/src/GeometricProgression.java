
public class GeometricProgression extends Progression{
	protected long multiplier;
	
	public GeometricProgression() {
		this(2, 1);
	}
	
	public GeometricProgression(long multi) {
		this(multi, 1);
	}
	
	public GeometricProgression(long multi, long start) {
		super(start);
		multiplier = multi;
	}
	
	public void advance() {
		current *= multiplier;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeometricProgression geoPro1 = new GeometricProgression(3, 2);
		geoPro1.printProgression(10);
	}

}
