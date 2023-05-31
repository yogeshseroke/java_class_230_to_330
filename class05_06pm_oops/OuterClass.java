package class05_06pm_oops;

public class OuterClass {

	
	void display() {
		System.out.println("outer");
	}
	
	//skip...
	static class InnerClass1 {

		static void display1() {
			System.out.println("inner 1");
		}
		
		class InnerClass1_1{
			
			void display() {
				System.out.println("inner 1_1");
			}
		}
	}

	class InnerClass2 {
		void display2() {
			System.out.println("inner 2");
		}
	}

	class InnerClass3 {

		void display3() {
			System.out.println("inner 3");
		}
	}
	//add, sub, mul, div, mod, si
	public static void main(String args[]) {
		OuterClass obj = new OuterClass();
//		obj.display();
		
		//inner call...using non-static
		
//		obj.new InnerClass1().display1();
//		
//		obj.new InnerClass2().display2();
//		
//		obj.new InnerClass3().display3();
		
		//inner call...using static...
		
		//OuterClass.InnerClass1.display1();
		
	//OuterClass.InnerClass1.InnerClass1_1.display();	
		
//		InnerClass1_1.display();
		
//		OuterClass.InnerClass1.new InnerClass1_1.display();

//		InnerClass1_1 obj1 = new InnerClass1_1();
//		OuterClass.InnerClass1.obj1.new InnerClass1_1().display();
		
		
		//OuterClass.InnerClass1.new InnerClass1_1().obj.display();

		InnerClass1 outer = new InnerClass1();
		InnerClass1.InnerClass1_1 inner = outer.new InnerClass1_1();
		
		inner.display();
		
//		EncapsulationExample obj1 = new EncapsulationExample();
//		obj1.accept();
//		obj1.display();

		
		
	}
}
