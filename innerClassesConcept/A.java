package innerClassesConcept;
//outer class
public class A {

	
	//outer method...
	void display1() {
		System.out.println("outer method of A...");
	}
	
	//inner class 1
	static class B{
		//inner method...
		void display2() {
			System.out.println("inner method of B...");
		}
		
		
		//inner class 1_1
		class B1{
			
		 void display2_1() {
				System.out.println("inner method of inner class B1 of B");
			}
		}
	}
	
	 //inner class 2
	static class C{
		//inner method...
			static void display3() {
					System.out.println("inner method of C...");
				}
	}
	
	//wrong
//	class D{
//		
//		static class D1{
//			
//		}
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	A obj1 = new A();
//	obj1.display1();
	
	//obj1.new B().display2();
	
//		B obj2 = obj1.new B();
//
//		obj2.display2();
		
		//==========================================
		
//		A obj1 = new A();
//		
//		obj1.display1();
//		
//		obj1.new B().display2();
//		
//		obj1.new C().display3();
		
		//============================================
		
		
//		A obj1 = new A();
//		obj1.new B().new B1().display2_1();
		
		//===========================================
		
		//A obj1 = new A();
		//obj1.C.display3();//wrong
		
//		obj1.new C().display3();//wrong
		
//		A.C.display3();//right
		
		//=============================================
		
		
		
//		B obj2 = new B();
		
//		B.B1 obj3 = obj2.new B1();
//		
//		obj3.display2_1();
		/*
		 * 
		 * 
		 * 
		 * */
		
		
	}

}
