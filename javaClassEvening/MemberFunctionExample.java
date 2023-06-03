package javaClassEvening;

public class MemberFunctionExample {

	/*
	 *  memberFunction => static and non-static
	 *  
	 *  				static :- parameterized and non parameterized
	 *  
	 *  						- with return type and without return type.
	 *  
	 *  
	 *  				non-static :- parameterized and non parameterized
	 *  
	 *  				     		- with return type and without return type.	
	 * 
	 * */
	
	// static memberFunction...
	
	// non-parameterized...
	
	static void accept() {
		System.out.println("static and non-parameterized");
	}
	
	// paramerized
	
	static void accept1(int a) {
		System.out.println("static and parameterized = "+a);
	}
	
	// non-parameterized and return type...
	
	static String accept2() {
		System.out.println("static and non-parameterized and return type");
		return "return type example";
	}
	
	// parameterized and return type...
	
	static String accept3(int a) {
		System.out.println("static and parameterized and return type "+a);
		return "return type example";
	}
	
	//HW => add,sub,mul,mod,div,si
	
	//non-static memberFunction...
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MemberFunctionExample.accept();
		
		MemberFunctionExample.accept1(12);
		
		String s = MemberFunctionExample.accept2();
		
		System.out.println(s);
		
		String s1 = MemberFunctionExample.accept3(23);
		
		System.out.println(s1);
	}

}
