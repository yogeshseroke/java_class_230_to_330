package class05_06pm_oops;

public class InterfaceExampleClass implements InterfaceExample{

	public void info() {
		System.out.println("abstract method of interface...");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InterfaceExampleClass obj = new InterfaceExampleClass();
		obj.d1();
		
		//it should be call with interface name
		InterfaceExample.d2();
		
		obj.info();
		
	}

}
