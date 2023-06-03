package oopsConceptExample;

public class MemberFunctionExample {

	//member functions....(1) static (2) non-static
	
	//non-static method...
//	void display() {
//		System.out.println("This is non-static method");
//	}
	
	//static method..
//	static void dis() {
//		System.out.println("This is static method");
//	}
	
	static int p,r,t,si;
	
	static void accept() {
		p=10000;
		r=2;
		t=1;
	}
	
	static void logic() {
		si=(p*r*t)/100;
	}
	
	static void display() {
		System.out.println(si);
	}
	public static void main(String args[]) {
		MemberFunctionExample obj = new MemberFunctionExample();
//		obj.accept();
//		obj.logic();
//		obj.display();
		MemberFunctionExample.accept();
		MemberFunctionExample.logic();
		MemberFunctionExample.display();
		
		//MemberFunctionExample.dis();
		
	}
}
