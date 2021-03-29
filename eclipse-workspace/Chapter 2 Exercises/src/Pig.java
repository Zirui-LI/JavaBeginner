
public class Pig <T> extends Object {
	protected T nose;
	public static <T> void eat(T food) {
		System.out.println("Pig eat");
	}
	public void wallow() {
		System.out.println("Pig wallow");
	}
}
