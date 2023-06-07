package class05_06pm;

public class SuperKeyWordExampleChild extends SuperKeyWordExample{

	
	public SuperKeyWordExampleChild() {
		
//		this.display1();wrong
//		this.display2();wrong		
		super();
		
		this.display1();//right
		this.display2();//right

		
	}
	
	
	void display2() {
//		this.display1();
//		super.display1();
		System.out.println("child method");
	}
	
	public static void main(String args[]) {
		
		SuperKeyWordExampleChild obj = new SuperKeyWordExampleChild();
		//obj.display2();
	}
}
