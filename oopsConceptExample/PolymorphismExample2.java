package oopsConceptExample;

public class PolymorphismExample2 {

	int a, b, c;
	
	void accept(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	void logic() {
		
		c = a + b;
	}
	
	void display() {
		System.out.println(a +" + " + b +" = "  + c);
	}
}
