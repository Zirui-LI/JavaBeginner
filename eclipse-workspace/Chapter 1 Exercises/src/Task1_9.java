//Write a short Java method that uses a StringBuilder instance 
//to remove all the punctuation from a string s storing a sentence, 
//for example, transforming the string "Let’s try, Mike!" to "Lets try Mike".

public class Task1_9 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputStr = "Let's do it, Mike!";
		System.out.println(removePunc(inputStr));
	}
	public static String removePunc(String inputStr) {
		
		StringBuilder outputStr = new StringBuilder();
		char [] charArray = inputStr.toCharArray();
		for (char letter : charArray){
			int ascLetter = (int) letter;
			if (!(ascLetter > 32 && ascLetter < 48)) {
				outputStr.append(letter);
			}
		}
		return outputStr.toString();
	}

}
