package class05_06pm_oops;


	//Absraction :- data hiding

	/*
	 *   access specifier   :-   public, private, protected, default
	 *   
	 *   abstract class     :- 
	 *   
	 *   interface          :-
	 * 
	 * */

public class AbstractionExample {

		//public :- same package, other package
	
	
//	public void add() {
//		System.out.println("public method");
//	}
	
	//private :- same class
	
//	private void info() {
//		System.out.println("deepak is smart boy...");
//	}
	
	//protected :- same package, different package- sub class
//	protected void add() {
//		System.out.println("protected method...");
//	}
	
	//default :- same package
    void add() {
		System.out.println("default method...");
	}
	
	
	
	public static void main(String args[]) {
		AbstractionExample obj = new AbstractionExample();
		//obj.info();
//		obj.add();
		
	obj.add();
	
	}
	
	
	
}
