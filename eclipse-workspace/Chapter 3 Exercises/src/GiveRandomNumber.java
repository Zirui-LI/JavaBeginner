import java.util.Arrays;
import java.util.Random;

public class GiveRandomNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int data[] = new int[5];
		Random rand = new Random();
		rand.setSeed(92);
		int a = 12, b = 5, n = 100, cur = rand.nextInt();
		for(int i = 0; i < data.length; i++)
			data[i] = rand.nextInt(100);
		int[] orig = Arrays.copyOf(data, data.length);
		System.out.println("Arrays equal before sort:" + Arrays.equals(data, orig));
		Arrays.sort(data);
		System.out.println("arrays equal after sort: " + Arrays.equals(data, orig));
		System.out.println("orig = " + Arrays.toString(orig));
		System.out.println("data = " + Arrays.toString(data));
	}

}
