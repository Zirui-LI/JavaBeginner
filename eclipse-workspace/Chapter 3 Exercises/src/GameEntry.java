
public class GameEntry {
	private String name;
	private int score;
	
	public GameEntry(String n, int s) {
		name = n;
		score = s;
	}
	public String getName() { return name; }
	public int getScore() { return score; }
	public String toString() {
		return "(" + name + ", " + score + ")";
	}
}

//public class Sort {
//	
//	public static void insertionSort(char[] data) {
//		for (int j = 1; j < data.length; j++) {
//			int i = j;
//			char temp = data[i];
//			while(i > 0  && data[i-1] > data[i]) {
//				data[i] = data[i-1];
//				i--;
//			}
//			data[i] = temp;
//		}
//	}
//	
//	public static void main(String [] args) {
//		char[] charArray = {'b', 'f', 'e', 'y', 'i'};
//		insertionSort(charArray);
//		for(char c : charArray) {
//			System.out.println(c);
//		}
//	}
//}
