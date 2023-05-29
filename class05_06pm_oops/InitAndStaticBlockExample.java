package class05_06pm_oops;

public class InitAndStaticBlockExample {

	/*
	 * init block :- it is used to initialized dynamic value
	 * 
	 * {
	 * 
	 * int a; int b; . . . 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * static block :- it is used to initialized static value
	 * 
	 * 
	 * 
	 * static {
	 * 
	 * int x; int y; . . .
	 * 
	 * }
	 * 
	 */

//	int a, b, c;
//	{
//		a = 10;
//		b = 20;
//
//	}
//
//	void display() {
//		c = a + b;
//		System.out.println(c);
//	}

	static int x,y,z;
	
	static {
		x = 10;
		y = 20;
	}
	
	void display() {
		z = x+y;
		System.out.println(z);
	}
	
//===================================================
	
//add, sub, mul, div, mod, si

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InitAndStaticBlockExample obj = new InitAndStaticBlockExample();
		
		obj.display();
		
	}

}
