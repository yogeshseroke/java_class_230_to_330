package class05_06pm;

public class OperatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		//operator... -> unary / binary / ternary
		
		//a+b -> a and b = operand / + -> operator
		//c = a + b
		//a++;
		
		
		//(1) Unary Operator.....pre=increment/decrement, post=increment/decrement
		
//		int a = 1;
//		System.out.println(a);
//		a++;
//		System.out.println(a);
//		++a;
//		System.out.println(a);
//		
//		a--;
//		System.out.println(a);
//		--a;
//		System.out.println(a);
		
		
		//post increment => first assign then increment  
//		int a = 1;
//		System.out.println("a before increment "+a);
//		int r = a++;
//		System.out.println("r first take value from a "+r);
//		System.out.println("a after increment "+a);
		
		//pre increment => first increment then assignment
//		int a1 = 1;
//		System.out.println("value of a1 = "+a1);
//		int r1 = ++a1;
//		System.out.println("r1 take value from a1 after increment in a1 "+r1);
//		System.out.println("a1 after increment "+a1);

		//post decrement =>
		
//		int a = 1;
//		System.out.println("value of a = "+a);//1
//		int r = a--;
//		System.out.println("value of r = "+ r);//1
//		System.out.println("value of a = "+a);//0
		
		//pre decrement =>
		
//		int a1 = 1;
//		System.out.println("value of a1 = "+a1);//1
//		int r1 = --a1;
//		System.out.println("value of r1 = "+r1);//0
//		System.out.println("value of a1 = "+a1);//0
		
		//(2) Binary => Arithmetic / Comparison / Logical / Assignment(simple and complex)
		
		//Arithmetic operator:- +,-,*,/,%
		
	//	int a=1,b=1,c=2,d=2,e=3;
		
//		System.out.println(a+b);//2
//		System.out.println(e-d);//1
//		System.out.println(c/d);//1
//		System.out.println(a*b);//1
//		System.out.println(e%d);//1
//		System.out.println(a/b+c*d-e);//1/2/1/2
		//BODMAS//1+4=5-3
		
		//Comparison operator:- <,>,==,<=,>= or equals()
//		int a = 10;
//		int b = 10;
//		if(a>b) {
//			System.out.println("a > b");
//		}else {
//			System.out.println("b > a");
//		}
		
//		if(a<=b) {
//			System.out.println("a > b");
//		}else {
//			System.out.println("b > a");
//		}
		
//		String s1 = "Hello";
//		String s2 = "Hello";
//		String s3 = new String("Hello");
//		
//		if(s1 == s2) {
//			System.out.println("Equals");//equals
//			}else {
//				System.out.println("Not Equals");
//			}
//		
//		if(s1 == s3) {
//			System.out.println("Equals");
//			}else {
//				System.out.println("Not Equals");//not equals
//			}
//		
//		if(s1.equals(s3)) {
//			System.out.println("Equals");//equals
//			}else {
//				System.out.println("Not Equals");
//			}
		
		
		
		//Logical operator:-and/  && => both condition must be true,
		//					or/   || => any single value can be true,
		//					not/  !  => it opposite of true or false.
		
//		int a = 121;
//		int b = 14;
//		
//		if((a%2==0) && (b%2==0)) {
//			System.out.println("a and b are even");
//		}else {
//			System.out.println("a or b are odd");
//		}
		
//		String userName = "abc";
//		String passWord = "123@xyz";
//		
//		if((userName == "abc") && (passWord == "123@xyz")) {
//			System.out.println("valid userName and passWord");
//		}else {
//			System.out.println("invalid userName or passWord");
//		}
		
//		int a = 21;
//		int b = 4;
		
//		if((a%2==0) || (b%2==0)) {
//			System.out.println("a or b are even");
//		}else {
//			System.out.println("a or b are odd");
//		}
		
//		int num = 20;
//		int a = 20;
//		
//		if(a != num) {
//			System.out.println("a == num");
//		}else {
//			System.out.println("a is not equal to num");
//		}
		
		
		
		//Assignment operator:- a=10(simple), a += 10(complex/shorthand)
		
//		int a = 10;
//		int b = a;
		
//		int a = 1;
//		System.out.println("a = " + a);
//		a += 1;//a = a+1
//		System.out.println("a += 1 " + a);
		
//		int a = 1;
//		a -= 1;
//		System.out.println("a -= 1, "+ a);
		
//		int a = 10;
//		a /= 2;
//		System.out.println("a /= 1, "+ a);
		
//		int a = 11;
//		a %= 2;
//		System.out.println("a %= 1, "+ a);
		
//		int a = 10;
//		a *= 2;
//		System.out.println("a *= 1, "+ a);
		
		/*(3) Ternary Operator => It is used to solved conditional based problem 
								  using a single line statement.....
								  
				Syntex :- (condition) ? "true" : "false" ;	
						  (20 > 10)	? "20 is greater than 10" : "not greater"; 
		*/	
	
//		int num = 20;
//		int a = 100;
//		
//		String result = (num > a) ? "num is greater than a" : "a is greater than num";
//		System.out.println(result);
	
	}

}
