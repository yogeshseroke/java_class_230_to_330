package class05_06pm_oops;

public interface InterfaceExample {

	//abstract method...
	void info();
	
	//default method...
	default void d1() {
		System.out.println("default method of interface");
	}
	
	//static method...
	static void d2() {
		System.out.println("static method of interface");
	}
	
	//()->{System.out.println("lambda expression");};
}
