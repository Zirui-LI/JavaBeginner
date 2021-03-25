//Write a short Java method that counts the number 
//of vowels in a given character string.

import java.util.Arrays;
import java.util.Scanner;

public class Task1_8{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word: ");
		String inputStr = input.nextLine();
		System.out.println(countVowels(inputStr));
	}
	public static int countVowels(String word) {
		int wordLen = word.length();
		int vowelCount = 0;
//		char [] vowels = {'a', 'e', 'i', 'o', 'u'};
		for (int i=0; i<wordLen; i++) {
			System.out.println(word.charAt(i));
			if (Arrays.asList('a', 'e', 'i', 'o', 'u').contains(word.charAt(i))) {
				vowelCount += 1;
			}
		}
		return vowelCount;
	}
}
