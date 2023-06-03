package oopsConceptExample;

public interface AbstractionExampleInterface {

	//default method...
	default void add() {
		System.out.println("default method");
	}
	
	//static method...
	static void sub() {
		System.out.println("static method");
	}
	
	//abstract method...
	void multi();
	
}
