
public class Scoreboard {
	private int numEntries = 0;
	private GameEntry[] board;
	
	public Scoreboard(int capacity) {
		board = new GameEntry[capacity];
	}
	
	public void printBoard() {
		for (GameEntry e:board) {
			if(e==null) {
				System.out.println("null"); 
				continue;}
			System.out.println(e.toString());
		}
	}
	
	public void add(GameEntry e) {
		int len = board.length;
		
		if(numEntries < len|| e.getScore() > board[numEntries-1].getScore()) {
			if(numEntries < len) numEntries++;
			int j = numEntries - 1;
			while(j>0 && e.getScore() > board[j-1].getScore()) {
				board[j] = board[j-1];
				j--;
			}
			board[j] = e;
		}
	}
	
	public GameEntry remove(int i) throws IndexOutOfBoundsException {
		if(i<0 || i >= numEntries) throw new IndexOutOfBoundsException("Invalid index: " + i);
		GameEntry temp = board[i];
		for(int j = i; j < numEntries - 1; j++) {
			board[j] = board[j + 1];
		}
		board[numEntries - 1] = null;
		numEntries--;
		return temp;
	}
	
	public static void main(String [] args) {
		Scoreboard board = new Scoreboard(5);
		for (int i = 1; i <= 10; i++) {
			GameEntry e = new GameEntry("number " + i, i);
			board.add(e);
		}
		board.printBoard();
		board.remove(0);
		board.printBoard();
	}
	
}
