//Write a short Java method, isMultiple, that takes two long values,
//n and m, and returns true if and only if n is a multiple of m,
//that is, n = mi for some integer i.

public class Task1_3 {
	public static void main(String [] args) {
		System.out.println(isMultiple(100,2));
		System.out.println(isMultiple(100,3));
	}
	public static boolean isMultiple (long m, long n) {
		if(m % n == 0) {
			return true;
		}
		return false;
	}
}
