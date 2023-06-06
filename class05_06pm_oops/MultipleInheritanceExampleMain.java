package class05_06pm_oops;

public class MultipleInheritanceExampleMain implements MultipleInheritanceExample1, MultipleInheritanceExample2{

	public void d1() {
		System.out.println("abstract method using multiple interface...");
	}
	
	
	
	
	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		MultipleInheritanceExample1.super.defaultMethod();
		MultipleInheritanceExample2.super.defaultMethod();
		
//		System.out.println("interface 1");
	}

	
	public static void staticMethod() {
		// TODO Auto-generated method stub
		MultipleInheritanceExample1.staticMethod();
		MultipleInheritanceExample2.staticMethod();
		
//		System.out.println("interface 1");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleInheritanceExampleMain obj = new MultipleInheritanceExampleMain();
		obj.d1();
		
		obj.defaultMethod();
		
		MultipleInheritanceExampleMain.staticMethod();
	}

}
