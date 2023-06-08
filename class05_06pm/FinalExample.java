package class05_06pm;

//public final class FinalExample {
public class FinalExample{

	
	
	/*
	 * 
	 *   final keyword :- variable => constant / value fixed
	 *                 :- method => prohibited from overriding
	 *                 :- class => inherited
	 * */
	
	final void display() {
		System.out.println("final method..");
	}
	
	
	public static void main(String args[]) {
		
		final int a = 30;//constant, value fixed
		
		System.out.println(a);
		
//		a = 20;
//		
//		System.out.println(a);
		
	}
	
 
	
}
