package loopExample;
import java.util.Scanner;

import oopsConceptExample.AbstractionExample;

public class DoWhileLoop extends AbstractionExample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  initialization....
		 *  do{
		 *  	statement...
		 *  	increment...
		 *  }while(condition);
		 */
//		1 to 10 print..
//		int i = 1;
//		do {
//			System.out.println(i);
//			i++;
//		}while(i<=10);

		
		//fibonacci series...
//		int i=1;
//		int a=0,b=1,c=0;
//		do {
//			System.out.print(a+" ");
//			c = a + b;
//			a = b;
//			b = c;
//			i++;
//		}while(i<=5);
		
		//prime number...
		/* 
		 * num % i == 0 
		 * */
//		int num = 12;
//		int i = 1, count = 0;
//		do {
//			if(num % i == 0) {
//				count++;
//			}
//			i++;
//		}while(i<=7);
//		
//		if(count==2) {
//			System.out.println("Prime");
//		}else {
//			System.out.println("not prime");
//		}
		
		//another way to find prime number...
		
//		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		int i = 2;
//		int count = 1;
//		
//		do {
//			if(num%i==0) {
//				count++;
//			}
//			i++;
//		}while(i<=num);
//		
//		if(count==2) {
//			System.out.println("prime");
//		}else {
//			System.out.println("not prime");
//		}
		
		//factorial..
		
//		int fact=1;
//		int i=1;
//		do {
//			fact = fact * i;
//			System.out.println(fact);
//			i++;
//		}while(i<=5);
//		int i=0;
//		do {
//			int j=0;
//			do {
//				System.out.print("* ");
//				j++;
//			}while(j<=i);
//			System.out.println();
//			i++;
//		}while(i<5);
		
		
		
		//=====================
		
		AbstractionExample obj = new AbstractionExample();
		
		//System.out.println(obj.a=10);//public
		//System.out.println(obj.b);//it is a private
		//obj.display();//private variable access using public method
		//obj.c;
//		DoWhileLoop obj1 = new DoWhileLoop();//for protected 
//		System.out.println(obj1.c=20);//protected variable access
		
		//default access try...
		
//		obj1.d=10;
	}

}
