package class05_06pm_oops;

//child 1....
public class Inheritance2 extends Inheritance1{

	void sub() {
		int a=10;
		int b=2;
		System.out.println(a-b);
	}
	
	static void sub1() {
		System.out.println("this is static method of child 1");
	}
	
	public static void main(String args[]) {
		System.out.println("child main()");
	}
	
	
	
}
