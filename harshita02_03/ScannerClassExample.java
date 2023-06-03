package harshita02_03;

import java.util.Scanner;

public class ScannerClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * PrintStream class => (out object), (print and println) System.out.println();
		 * 
		 * how to take input in java ? => we can take input from user using InputStream
		 * class
		 * 
		 * read() method :- take input in byte form
		 * 
		 * System.in => reference
		 * 
		 * Scanner class => java.util package 
		 * 				 =>	user input accept
		 * 				 => predefine methods provides
		 */
		
		
		//how we can create object in java....
		/*
		 *    className objectName = new className();
		 *    
		 *    A obj = new A();
		 * 
		 * */
//		System.out.println("Enter any number");
		Scanner sc = new Scanner(System.in);
		// sc.nextInt()
//		int num = sc.nextInt();
//		System.out.println(num);
		
		//sc.nextFloat()
//		float num1 = sc.nextFloat();
//		System.out.println(num1);

		//string 
		//sc.next()  or sc.nextLine()
//		System.out.println("enter string");
//		String s1 = sc.next(); //single word
	
//		System.out.println("enter string");		
//		String s2 = sc.nextLine();// paragraph
//		
//		System.out.println(s2 );
		
		//char 
		System.out.println("enter character");
		char c = sc.next().charAt(2);// yogesh seroke
		                             // 01234567891011
		System.out.println(c);
	}

}
