package class05_06pm_oops;

public class ClassAndObjectExample {

//	int a;
//	
//	void display() {
//		System.out.println("a = " + a);
//	}
	
	//HW :- add, sub, mul, div, mod, si

	int a,b,c;
	
	void accept() {
		a=10;
		b=20;
	}
	
	void add() {
		c=a+b;
	}
	
	void display() {
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object :- className objectName = new className();
		
		ClassAndObjectExample obj = new ClassAndObjectExample();
		obj.add();
			
		//obj.accept();
		
		
//		obj.display();
	}

}
