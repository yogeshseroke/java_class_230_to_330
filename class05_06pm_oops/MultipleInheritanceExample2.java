package class05_06pm_oops;

public interface MultipleInheritanceExample2 {

	default void defaultMethod() {
		System.out.println("default method 2...");
	}
	
	static void staticMethod() {
		System.out.println("static method 2...");
	}
	
	abstract void d1(); 
}
