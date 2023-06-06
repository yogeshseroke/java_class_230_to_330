package class05_06pm_oops;


	//Absraction :- data hiding

	/*
	 *   access specifier   :-   public, private, protected, default
	 *   
	 *   abstract class     :-   abstract key-word
	 *						:-   We can't create object of abstract class 		
	 *						:-   we can write default and static method and also main() in abstract class
	 *
	 *   				abstract class A{
	 *   						
	 *   						String name = "sbi";
	 *   						abstract void info();	
	 *   					}
	 *   
	 *   				class B extends A{
	 *   						void info(){
	 *   								String pin = "";
	 *   							}
	 *   				}
	 *   
	 *   interface         :- pure abstract class... means it consists only abstract methods
	 *                     :-   We can't create object of interface   
	 *   				   :- after launching jdk 1.8 we can write static and default method in interface.
	 *   				   :- interface key-word
	 *   				   :- we have to create public method of abstract method of interface..
	 *   
	 *   				eg:-   interface A{
	 *   
	 *   								void info();//abstract method..
	 *									
	 *									//static method... 
	 *									static void display(){
	 *
	 *
	 *									}
	 *
	 *									//default method...	
	 *									default void dis(){
	 *
	 *									}				   	
	 *   		
	 *   						}
	 *   
	 *
	 * 						class B implements A{
	 * 							//implementation of abstract method of interface...
	 * 							void info(){
	 * 
	 * 
	 * 							}
	 * 
	 * 						}
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
