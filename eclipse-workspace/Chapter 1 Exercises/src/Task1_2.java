
public class Task1_2 {
	public static void main(String[] args) {
		GameEntry [] A = new GameEntry[10];
		GameEntry [] B = A;
		A[4] = new GameEntry(550);
		System.out.println(B[4].getScores());
	}
}
