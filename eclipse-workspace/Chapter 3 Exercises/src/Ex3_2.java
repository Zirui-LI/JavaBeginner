import java.util.Arrays;
import java.util.Random;

public class Ex3_2  {
	
	public static int[] RandomRemove(int[] array) {
		
		Random rand = new Random();
		int len = array.length;
		while(len > 0) {
			int index = rand.nextInt(len);
			int[] array1 = new int[len - 1];
			System.out.println("Remove array["+index+"] = "+ array[index]);
			for(int i = 0; i < index; i++) {
				array1[i] = array[i];
			}
			for(int i = index; i < len - 1; i++) {
				array1[i] = array[i+1];
			}
			len--;
			array = array1;
		}
		return array;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {0,1,2,3,4,5,6,7,8,9};
		RandomRemove(array);
	}

}
