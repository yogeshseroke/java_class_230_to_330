package class05_06pm;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//unchecked exception...
		
//		int a = 10;
//		
//		int b = 'v';
		
//		try {
//		     int c = a/b;
//		     System.out.println(c);
//		}catch(Exception ex) {
//			System.out.println(ex.getMessage());
//		}
		
		//finally...
		
//		try {
//		     int c = a/b;
//		     System.out.println(c);
//		}catch(Exception ex) {
//			System.out.println(ex.getMessage());
//		}finally {
//			System.out.println("finally block");
//		}
		
		Scanner sc = new Scanner(System.in);
			
//		try {
//			System.out.println("enter first number");
//			 int a = sc.nextInt();
//				System.out.println("enter Second number");
//			 int b = sc.nextInt();
//		     int c = a/b;
//		     System.out.println(c);
//		}catch(NumberFormatException ex) {
//			System.out.println("b");
//		}catch(InputMismatchException ex) {
//			System.out.println("c");
//		}finally {
//			System.out.println("finally block");
//		}
		
		try {
			Integer n = 97;
			String s = n.toString();
		//	String s =String.valueOf(sc.nextInt());
		//	int num = Integer.parseInt(sc.next());
//			System.out.println("given number = " + num);
			System.out.println("given string = " + s);
		}catch(NumberFormatException ex) {
			System.out.println(ex.getMessage());
		}
	}

}
