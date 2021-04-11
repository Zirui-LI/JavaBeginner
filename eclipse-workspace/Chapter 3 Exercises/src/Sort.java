
public class Sort {
	
	public static void insertionSort(char[] data) {
		for(int i = data.length - 1; i >= 1; i--) {
			int j = data.length - i;
			char temp = data[j];
			while(data[j] < data[j-1]) {
				data[j] = data[j-1];
				j--;
			}
			data[j] = temp;
		}
	}
	
	public static void main(String [] args) {
		char[] charArray = {'b', 'f', 'e', 'y', 'i'};
		insertionSort(charArray);
		for(char c : charArray) {
			System.out.println(c);
		}
	}
}
