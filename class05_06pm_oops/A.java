package class05_06pm_oops;

public class A {

	static class B {
		class C {

			void display() {
				System.out.println("method of Class C");
			}
		}

	}

	public static void main(String[] args) {

		A obj1 = new A();//unused

		B obj2 = new B();

		// class name = object name
		B.C obj3 = obj2.new C();
		obj3.display();
	}

}
