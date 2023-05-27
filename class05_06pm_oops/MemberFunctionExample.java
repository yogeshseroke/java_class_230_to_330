package class05_06pm_oops;

public class MemberFunctionExample {

	// member function....
	// static(parameterized, non-parameterized, written-type without written-type)
	// non-static(parameterized, non-parameterized, written-type without
	// written-type)

	// non-static, non-parameterized, without written-type
//	void add1() {
//		System.out.println("non-static, non-parameterized, without written-type");
//	}

	// non-static, non-parameterized, with written-type
//	String add2() {
//		System.out.println("non-static, non-parameterized, with written-type");
//		return "hello";
//	}

	// non-static, parameterized, without written-type
//	void add3(int a) {
//		System.out.println("non-static, parameterized, without written-type " + a);
//	}
	
	// non-static, parameterized, with written-type
//	String add4(int a) {
//		System.out.println("non-static, parameterized, with written-type " + a);
//		return "hi";
//	}

	//===================================
	
	
	//static :- static, non-parameterized, without written-type
	
//	static void add1() {
//		System.out.println("static, non-parameterized, without written-type");
//	}
//	
//	static String add2() {
//		System.out.println("static, non-parameterized, with written-type");
//		return "static";
//	}
//	
//	static void add3(int a) {
//		System.out.println("static, parameterized, without written-type "+ a);
//	}
//	
//	static String add4(int a) {
//		System.out.println("static, parameterized, with written-type "+a);
//		return "static";
//	}
	
	//add, sub, mul, div, mod, si
	
	//add with static method...
	static int c;
	static void add(int a, int b) {
	
		 c=a+b;
	}
	
	void display() {
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberFunctionExample obj = new MemberFunctionExample();
//		obj.add1();
//		String name = obj.add2();
////		System.out.println(obj.add2());
//		System.out.println(name);
//		
//		obj.add3(100);
//		
//		String name2 = obj.add4(500);
//		System.out.println(obj.add4(500));
//		System.out.println(name2);	
		
		//=================
		
//		MemberFunctionExample.add1();
//		
//		System.out.println(MemberFunctionExample.add2());
//		
//		MemberFunctionExample.add3(300);
//		
//		System.out.println(MemberFunctionExample.add4(200));
		
		MemberFunctionExample.add(12, 34);
		obj.display();
	}

}
