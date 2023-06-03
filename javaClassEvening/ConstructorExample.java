package javaClassEvening;

public class ConstructorExample {

	/*
	 * 		output:- System.out.print();
	 * 							println();
	 * 
	 * 			//PrintStreamClass :- object = out
	 * 							   :- print() and println();			
	 * 
	 *       how we can take input from user....
	 *       
	 * 			//InputStreamClass :- object = in
	 * 							   :- read() => byte(0 and 1)
	 *        System.in = reference => Scanner(System.in);
	 * 
	 * 		Scanner class => manage i/o and o/p
	 * */
	
	/* 
	 *       constructor :- object creation
	 *       			 :- constructorName = className
	 *       
	 *         type :- (1)default
	 *         		   (2)parameterized
	 *         		   (3)copy 
	 * 
	 * 
	 *    class A{
	 *    
	 *    }
	 *    
	 *    compile :- javac file.java
	 *    
	 *    class A{
	 *    	
	 *    	 	A(){
	 *    			//default constructor...
	 *    		}
	 *    }
	 * 
	 * */
	
	
	//default...
	ConstructorExample() {
	
		System.out.println("default constructor");
		//pattern
		
		/*
		 *      *
		 *      # *
		 *      * # *
		 *      # * # *
		 * 
		 * */
	}
	
	//parameterized...
	ConstructorExample(String fname, String lname){
			
			this.s1=fname;
			this.s2=lname;
		
			//System.out.println(fname + " " + lname);
			//SI program...
	}
	
	String s1;
	String s2;
	
	//copy constructor...
	ConstructorExample(ConstructorExample a, ConstructorExample b){
		this.s1=a.s1;
		this.s2=b.s2;
		//System.out.println(a +" "+ b);
	}
	
	void display() {
		System.out.println(s1+" "+s2);
	}
	public static void main(String[] args) {
	
		ConstructorExample obj = new ConstructorExample();

		ConstructorExample obj1 = new ConstructorExample("ABC","XYZ");
		
		ConstructorExample obj2 = new ConstructorExample(obj1, obj1);
		obj2.display();
	}
}
