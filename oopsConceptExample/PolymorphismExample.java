package oopsConceptExample;

public class PolymorphismExample {

//	void logic(int a, int b) {
//		System.out.println(a + b);
//	}
//
//	void logic(int a, float b) {
//		System.out.println(a - b);
//	}
//
//	void logic(float a, int b) {
//		System.out.println(a * b);
//	}
//
//	void logic(float a, float b) {		
//		System.out.println(a / b);
//	}
//
//	void logic(String s1) {
//		System.out.println(s1);
//	}

//	int logic(int a, int b) {
//		return a + b;
//	}
//
//	float logic(int a, float b) {
//		return a - b;
//
//	}
//
//	float logic(float a, int b) {
//
//		return a * b;
//	}
//
//	float logic(float a, float b) {
//
//		return a / b;
//	}
//
//	String logic(String s1) {
//
//		return s1;
//
//	}
	
	//si, armstrong, fibonnaci, factorial
	
	static float p,r,t,si;
	
	static float logic(float p, float r, float t) {
//		this.p = p;
//		this.r = r;
//		this.t = t;
		
		si = (p*r*t)/100;
		
		return si;
	}

	public static void main(String[] args) {
		PolymorphismExample obj = new PolymorphismExample();
//		obj.logic("start");
//		obj.logic("int int");
//		obj.logic(12, 12);
//		obj.logic("int float");
//		obj.logic(12, 1.2f);
//		obj.logic("float int");
//		obj.logic(2.3f, 34);
//		obj.logic("float float");
//		obj.logic(5.6f, 5.6f);
//		obj.logic("end");

//		String s1 = obj.logic("start");
//		System.out.println(s1);

//		System.out.println(obj.logic("start"));
//		System.out.println(obj.logic(1.2f, 12.3f));
//		System.out.println(obj.logic(1, 1));
//		System.out.println(obj.logic(12.3f, 3));
//		System.out.println(obj.logic(12, 6.7f));
//		System.out.println(obj.logic("end"));

//	    float result = obj.logic(45000, 2, 1);
		
		float result = PolymorphismExample.logic(45000, 2, 1);
	    System.out.println(result);
	}

}
