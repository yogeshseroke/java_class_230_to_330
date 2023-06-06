package class05_06pm_oops;

public interface MultipleInheritanceExample1 {

	default void defaultMethod() {
		System.out.println("default method 1...");
	}
	
	static void staticMethod() {
		System.out.println("static method 1...");
	}
	
	abstract void d1(); 
}
