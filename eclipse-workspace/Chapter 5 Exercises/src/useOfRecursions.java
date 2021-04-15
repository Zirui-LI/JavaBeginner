
public class useOfRecursions {
	
	public static void drawRuler(int nlnches, int majorLength) {
		drawLine(majorLength, 0);
		for (int j = 1; j <= nlnches; j++) {
			drawInterval(majorLength - 1);
			drawLine(majorLength, j);
		}
	}
	
	private static void drawInterval(int centralLength) {
		if (centralLength >= 1) {
			drawInterval(centralLength - 1);
			drawLine(centralLength, -1);
			drawInterval(centralLength - 1);
		}
	}
	
	public static boolean binarySearch(int[] data, int target, int low, int high) {
		/* Returns true if the target value is found in the indicated portion of the data array. 
		 This search only considers the array portion from data[low] to data[high] inclusive. */
		if (low > high) 
			return false;
		else {
			int mid = (low + high)/2;
			if(target == data[mid])
				return true;
			else if (target < data[mid])
				return binarySearch(data, target, low, mid - 1);
			else
				return binarySearch(data, target, mid + 1, high);
		}
	}
	
	private static void drawLine(int tickLength, int tickLabel) {
		for (int j = 0; j < tickLength; j++)
			System.out.print("-");
		if (tickLabel >= 0)
			System.out.print(" " + tickLabel);
		System.out.print("\n");
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		drawRuler(3, 4);
		
	}

}
