
public class Flower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower flower1 = new Flower();
		flower1.printInfo();
		System.out.println(flower1.getName());
		Flower flower2 = new Flower("Iris", 2, 10.2f);
		flower2.printInfo();
	}
	private String name;
	private int numPetals;
	private float price;
	public Flower() {
		name = "unknown";
		numPetals = 0;
		price = 0;
	}
	public Flower(String n, int pe, float pr) {
		name = n;
		numPetals = pe;
		price = pr;
	}
	public String getName() {
		return name;
	}
	public int getNum() {
		return numPetals;
	}
	public float getPrice() {
		return price;
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setNum(int pe) {
		numPetals = pe;
	}
	public void setPrice(float pr) {
		price = pr;
	}
	public void printInfo() {
		System.out.println("The name of the flower is " + name);
		System.out.println("The number of its petals is " + numPetals);
		System.out.println("The price of the flower is " + price);
	}
}
