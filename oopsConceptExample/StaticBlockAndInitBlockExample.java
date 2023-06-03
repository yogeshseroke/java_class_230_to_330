package oopsConceptExample;

public class StaticBlockAndInitBlockExample {

//	static int x,a;
//	static int y,b;
//	//static block....
//	
//			static {
////				int a=100;
////				int b=200;
//				a=100;
//				b=200;
//				
//			}
//	
//	static void accept() {
//		x=10;
//		y=20;
//	}
//	
//	static void display(){
//		System.out.println("a = "+a+" b = "+ b);
//		System.out.println("x = "+x+" y = "+ y);
//	}
//	
//	
//	//init block...
//	
//	int p,q,r,s;
//
//	{
//		p=1;
//		q=2;
//		r=3;
//		s=4;
//	}
//	
//	void display1() {
//		System.out.println(p+" "+q+" "+r+" "+s);
//	}
	
	
	static {
		System.out.println("static block1..");
	}
	
	{
		System.out.println("init block..");
	}
	
	StaticBlockAndInitBlockExample(){
		System.out.println("constructor....");
	}
	
	static {
		System.out.println("static block2..");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		StaticBlockAndInitBlockExample.accept();
//		//StaticBlockAndInitBlockExample.display();
//	
		System.out.println("main method....");
		StaticBlockAndInitBlockExample obj = new StaticBlockAndInitBlockExample();
//		obj.display1();
		//System.out.println("main method....");
	
	
	}

	
	
	static {
		System.out.println("static block3..");
	}
	
	static {
		System.out.println("static block4..");
	}
}
