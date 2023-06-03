package harshita02_03;

import java.util.concurrent.locks.Condition;

public class IfElseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//conditional statements :- condition based problems solve 
		
		/*
		 * 5types=>(simple if, multiple if, if-else, nested if-else, ladder if-else/else-if)
		 * 
		 * */
		
		
		/*		simple-if:- when condition always true...
		 					syntax :- 
		 								if(condition...)
		   								statement...
		*/
		
//		int num = 50;
//		
//		if(num<100) {
//			System.out.println("num<100");
//			System.out.println("num<100");
//		}
		
		
		
		//multiple if
		
//		int num1 = 20;
//		int num2 = 50;
//		int num3 = 150;
//		int num4 = 99;
//		if(num1<100) {
//			System.out.println("num1<100");
//		}
//		if(num2<100) {
//			System.out.println("num2<100");
//		}
//		if(num3<100) {
//			System.out.println("num3<100");
//		}
//		if(num4<100) {
//			System.out.println("num4<100");
//		}
		
		
		
		//if-else
		
		/*
				if(Condition...) <= true
				{
				
				}
				else <= false
				{
				
				}
		*/
		
//		int num = 10;
//		
//		if(num>20) {
//			System.out.println("num is greater");
//		}else {
//			System.out.println("num is less");
//		}
		
		
		//nested if-else....
		
		/*
		 * 				if(condition1){
		 * 						if(condition2){
		 * 
		 * 							statement....
		 * 						}else{
		 * 							statement...
		 * 						}
		 * 				}else{
		 * 						if(condition2){
		 * 
		 * 							statement....
		 * 						}else{
		 * 							statement...
		 * 						}						
		 * 				}
		 * 
		 * */
		
//		int a=100, b=20, c=30;
//		
//		if(a>b) {
//			
//			if(a>c) {
//				System.out.println("a is greatest");
//			}else {
//				System.out.println("c is greatest");
//			}
//		}else {
//			if(b>c) {
//				System.out.println("b is greatest");
//			}else {
//				System.out.println("c is greatest");
//			}
//		}
		
		
		//ladder if-else or else-if
		
		/*
		 * 
		 * 
		 *     if(condition..){
		 *     
		 *     		s1
		 *     }
		 *      else if(condition){
		 *        s2
		 *      }
		 *      else if(condition){
		 *        s3
		 *      }
		 *      else if(condition){
		 *         s4
		 *      } 
		 * 
		 *      else{
		 *      
		 *        last statement
		 *      }
		 * 
		 * 
		 * */
		
		
//		int num = 50;
//		
//		if(num>100) {
//			System.out.println("num>10");
//		}else if(num>200) {
//			System.out.println("num>20");			
//		}else if(num>300) {
//			System.out.println("num>30");
//		}else if(num>40) {
//			System.out.println("num>40");
//		}
//		
//		else {
//			System.out.println("num!=50");
//		}
		
		//num divible by 3,5,7
//		int num = 21;
//		if(num%3==0) {
//			if(num%5==0) { 
//				if(num%7==0) {
//					System.out.println("divisible by all 3,5,7");
//				}else {
//					System.out.println("divisible by 3 and 5");
//				}
//			}else {
//				if(num%7==0) {
//					System.out.println("divisible by 3 and 7");
//				}else {
//					System.out.println("divisible by only 3");
//				}	
//			}
//		}else {
//			if(num%5==0) {
//				if(num%7==0) {
//					System.out.println("divisible by both 5 and 7");
//				}else {
//					System.out.println("divisible by only 5");
//				}
//			}else {
//				if(num%7==0) {
//					System.out.println("divisible by only 7");
//				}else {
//					System.out.println("not divisible by 3,5,7");
//				}
//			}
//		}
		
		
	}

}
