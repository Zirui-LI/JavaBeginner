import java.util.*;

public class answersForEx {
	// Ex 5.1
	public static int findMax(int[] A, int low, int max) {
		if(low == max) {
			return A[low];
		} else if(low < max) {
			int mid = (low + max)/2;
			return Math.max(findMax(A, low, mid), findMax(A, mid+1, max));
		}
		return 0;
	}
	
	public static int findMax2(int [] A, int n) {
		if(n == 1)
			return A[0];
		return Math.max(findMax2(A, n - 1), A[n - 1]);
	}
	
	// Ex 5.2
	
	public static int binarySearchIndex(int[] A, int n, int low, int high) {
		if (low == high) {
			if (A[low] == n) return low;
			else return -1;
		} else if (low < high) {
			int mid = (low + high)/2;
			return Math.max(binarySearchIndex(A, n, low, mid), binarySearchIndex(A, n, mid+1, high));
		}
		return -1;
	}
	public static int binarySearchIndex2(int[] data, int target, int low, int high) {
		if (low > high) 
			return -1;
		else {
			int mid = (low + high)/2;
			if(target == data[mid])
				return mid;
			else if (target < data[mid])
				return binarySearchIndex2(data, target, low, mid - 1);
			else
				return binarySearchIndex2(data, target, mid + 1, high);
		}
	}
	
	//Ex 5.3
	public static double power(double x, int n) {
		if (n == 0)
			return 1;
		else {
			double partial = power(x, n/2);
			double result = partial * partial;
			if (n % 2 == 1)
				result *= x;
			return result;
		}
	}
	
	//Ex 5.7
	public static double harmonicNumber(int n) {
		if (n == 1) {
			return 1;
		}
		double temp = 1.0/n;
		return harmonicNumber(n - 1) + temp;
	}
	
	// Ex 5.8
	public static int convertStringToInteger(String str, int n) {
		char[] charArray = str.toCharArray();
		int temp = Character.getNumericValue(charArray[n - 1]);
		System.out.println(temp);
		if (n == 1) return temp;
		return 10*convertStringToInteger(str, n - 1) + temp; 
		
	}
	
	// Ex 5.9
	public static double powerNonRecursive(double x, int n) {
		if (n == 0)
			return 1;
		else {
			double result = 1;
			while (n > 0) {
				while ((n & 1) == 0) {
					n /= 2;
					x *= x;
				}
				n--;
				result *= x;
			}
			return result;
		}
		
	}
	
	
	// Ex 5-10

	public static int sum(int[][] data, int x, int n1, int y, int n2) {
	    if (n1 == 1 && n2 == 1) {
	        return data[x][y];
	    }
	    if (n1 == 1) {
	        return sum(data, x, n1, y, (n2 / 2)) + sum(data, x, n1, y + (n2 / 2), n2 - (n2 / 2));
	    } else {
	        return sum(data, x, (n1 / 2), y, n2) + sum(data, x + (n1 / 2), n1 - (n1 / 2), y, n2);
	    }
	}
	
	public static void main(String[] args) {
		// Ex 5.1
//		int[] A = {3,31,42,65,34,21,76,32,32,24,6,57,67};
//		long startTime = System.currentTimeMillis() ;
//		System.out.println(findMax(A, 0, 12));
//		long endTime = System.currentTimeMillis();
//		float elapsed = endTime - startTime;
//		System.out.println(String.format("%.5f", elapsed));
//		long startTime2 = System.currentTimeMillis() ;
//		System.out.println(findMax2(A, 13));
//		long endTime2 = System.currentTimeMillis();
//		float elapsed2 = endTime2 - startTime2;
//		System.out.println(String.format("%.5f", elapsed2));
		
		// Ex 5.2
		int[] A = {3,31,42,65,34,21,76,32,32,24,6,57,67};
		System.out.println(binarySearchIndex(A, 31, 0, 12));
		// Ex 5.7
		System.out.println(harmonicNumber(5));
		// Ex 5.8
		String s = "13153";
		System.out.println(convertStringToInteger(s, 5));
		// Ex 5.9
		System.out.println(powerNonRecursive(2, 11));
		// Ex 5.11
		int [][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}};
		System.out.println(sum(a, 0, 2, 0, 4));
	}

}
