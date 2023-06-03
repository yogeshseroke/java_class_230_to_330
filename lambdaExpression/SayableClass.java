package lambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class SayableClass {

	public static void main(String args[]) {
		
//		Sayable s = () -> {
//			return "I have nothing to say...";
//		};
//		
//		System.out.println(s.say());
		
		//======================================================
		
		//lambda function with parameter...
		
//		Sayable s = (name) -> {
//			return "Hello "+ name;
//		};
//		
//		String name = s.say("World");
//		System.out.println(name);
		
		//=======================================================
		
//		Sayable s = (fname, lname) -> {
//			return "Hello " + fname +" "+ lname;
//		};
//		
//		String fullName = s.say("yogesh", "seroke");
//		System.out.println(fullName);
		
		//========================================================
		
//		Sayable s = (a, b) -> {
//			return a+b;
//		};
//		
//		System.out.println(s.add(10, 10));
		
		//========================================================
		
//		Sayable s = (a,b) -> (a+b);
//		System.out.println(s.add(2, 2));
		
//		Sayable s = (int a, int b) -> (a+b);
//		System.out.println(s.add(1, 1));
		
		//========================================================
		
		
		//for-each loop...
		
//		List<String> obj = new ArrayList<String>();
//		
//		obj.add("A");
//		obj.add("B");
//		obj.add("C");
//		obj.add("D");
//		
//		obj.forEach( (n) -> System.out.println(n) );
		
		//============================================
		
		//multiple statements.....
		
//		Sayable s = () -> {
//			String fname = "yogesh";
//			String lname = "seroke";
//			return "hello "+ fname + lname;
//		};
//		
//		String result = s.say();
//		System.out.println(result);
		
		//=============================================
		
		//without using lambda creating thread....
		
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				
				System.out.println("thread 1 start...");
				
			}
		};
		
		Thread t1 = new Thread(r1);
		t1.start();
		
		//with using lambda creating thread...
		
		Runnable r2 = ()->{
			System.out.println("thread 2 start...");
		};
		
		r2.run(); //first way
		
		Thread t2 = new Thread(r2);//second way
		t2.start();
	}
}
