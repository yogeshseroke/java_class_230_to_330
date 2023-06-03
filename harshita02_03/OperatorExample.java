package harshita02_03;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// operator....

		/*
		 * it used to perform operation using one and more operand... eg.:- a+b here +
		 * is operator and a,b are opearands.
		 * 
		 * type of operators...
		 * 
		 * (1) unary operator :- single operand (2) binary operator :- two operand (3)
		 * ternary operator :- three operand
		 * 
		 */

		// unary operator :- increment(pre, post), decrement(pre, post)

//		int a=1;
//		System.out.println(a);
//		a++;// a = a + 1
//		System.out.println(a);
//		++a;//a = a + 1
//		System.out.println(a);

		// post-increment => first assign value than increment
//		int a = 1;
//		System.out.println("a = "+a);
//		int b = a++;//b=1
//		System.out.println("b = "+b);
//		System.out.println("a = "+a);

		// pre-increment => first increment than assign value

//		int a = 1;
//		System.out.println("a = "+a);
//		int b = ++a;//b=2
//		System.out.println("b = "+b);
//		System.out.println("a = "+a);

		// post-decrement => first assign value than decrease

//		int a = 1;
//		System.out.println("a = "+a);//1
//		int b = a--;//1
//		System.out.println("b = "+b);
//		System.out.println("a = "+a);//0

		// pre-decrement => first decrease than assign value

//		int a = 1;
//		System.out.println("a = "+a);//1
//		int b = --a;//0
//		System.out.println("b = "+b);
//		System.out.println("a = "+a);//0

//=================================================

		// binary operators :- arithmetic, comparison, logical, complex(shorthand)

		// arithmetic :- +,-,/,*,%

//		int a=10,b=20,c;
//		
//		c = a+b;//30
//		System.out.println(c);
//		c = b-a;//10
//		System.out.println(c);
//		c = b/a;//2
//		System.out.println(c);
//		c = a*b;//200
//		System.out.println(c);
//		c = a%b;//10
//		System.out.println(c);

		// comparison :- a<b, a>b, a==b, a<=b, a>=b, a!=b

//		int a = 20, b = 20;
//
//		if (a < b) {
//			System.out.println("a<b");
//		}
//		if (a > b) {
//			System.out.println("a>b");
//		}
//		if (a == b) {
//			System.out.println("a==b");
//		}
//		if (a <= b) {
//			System.out.println("a<=b");
//		}
//		if (a >= b) {
//			System.out.println("a>=b");
//		}
//		if (a != b) {
//			System.out.println("a!=b");
//		}

		// == and equals()

		/*
		 * String => predefine class => set of characters eg:- "abc xyz" => index of
		 * string is start from 0 eg:- "abc" 012
		 * 
		 * => we can define string as two different types... (1) String as a reference.
		 * 
		 * String s = "xyz"; it will store under string pool memory.
		 * 
		 * (2) String as an object. String s = new String("xyz"); * it will store under
		 * string heap memory. => pool vs heap
		 * 
		 * 
		 * (== operator) :- address comparison
		 * 
		 * (equals() method) :- value comparison
		 * 
		 */

//		String s = "hello";
//		String s1 = "hello";
//		
//		String s2 = new String("hello");
//		String s3 = new String("hello");
//		
//		if(s==s1) {
//			System.out.println("equal");//equal
//		}else {
//			System.out.println("not equal");
//		}	
//		//================
//		
//		if(s==s2) {
//			System.out.println("equal");
//		}else {
//			System.out.println("not equal");//not equal
//		}
//		//=================
//		
//		if(s.equals(s1)) {
//			System.out.println("equal");//equal
//		}else {
//			System.out.println("not equal");
//		}
//		//=================
//		
//		if(s.equals(s2)) {
//			System.out.println("equal");//equal
//		}else {
//			System.out.println("not equal");
//		}

//===============================================================

		// logical operators.... &&, ||, !

		/*
		 * and => && (both conditions must be true) or => || (at least one condition
		 * must be true) not => ! (it is true opposite of true)
		 * 
		 * 
		 */

//		int num = 4;
//		
//		if(num>1 && num>2 && num>3) {
//			
//			System.out.println("num > 1,2,3");
//		}else {
//			System.out.println("num <= 1,2,3");
//		}

//		int num = 10;
//
//		if (num > 1 || num < 20 || num > 30) {
//
//			System.out.println("if statement");
//		} else {
//			System.out.println("else statement");
//		}

//		int num = 2;
//
//		if (num != 1) {
//
//			System.out.println("num not equal to 1");
//		} else {
//			System.out.println("num is equal to 1");
//		}
		
		//====================================
		//simple assignment.... int a = 10; b = a
		//complex assignment or shorthand operator
		/*
		 *       int a = 10;
		 *       a += 10; => a = a + 10
		 *       a -= 1;  => a = a - 1
		 *       a *= 15; => a = a * 15
		 *       a /= 1;  => a = a / 1
		 *       a %= 1;  => a = a % 1
		 * 
		 * 
		 * */
//	      			int a = 10;
//			        a += 10; //=> a = a + 10   (20)
//			        System.out.println(a);
//			        
//			        a -= 1;  //=> a = a - 1    (19)
//			        System.out.println(a);
//			        
//			        a *= 15; //=> a = a * 15   (19*15=285)
//			        System.out.println(a);
//			        
//			        a /= 1;  //=> a = a / 1    (285/1=285)
//			        System.out.println(a);
//			        
//			        a %= 1;  //=> a = a % 1    (285%1=0)
//			        
//			        System.out.println(a);
		
		
		//========================================================
		
		// Ternary Operator:-   three oprand
		
		/*
		 *    Syntax :-          (condition) ? true : false;
		 * 				String s = (10 > 9) ? "true" : "false";
		 * 
		 * */
		
//			 String s = (10 > 9) ? "true" : "flase";
//			 System.out.println(s);
	}

}
