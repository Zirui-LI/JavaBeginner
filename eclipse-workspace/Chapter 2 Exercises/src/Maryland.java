// dynamic dispatch
// Java decides at runtime to call the version of the method that
// is most specific to the actual type of the referenced object (not the declared type)
public class Maryland extends State {
	Maryland() { /* null constructor */ }
	public void printMe( ) { System.out.println("Read it."); }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Region east = new State(); 
		State md = new Maryland();
		Object obj = new Place(); 
		Place usa = new Region(); 
		md.printMe( );
		east.printMe( );
		((Place) obj).printMe();
		obj = md;
		((Maryland) obj).printMe(); 
		obj = usa;
		((Place) obj).printMe(); 
		usa = md;
		((Place) usa).printMe();
	}

}
