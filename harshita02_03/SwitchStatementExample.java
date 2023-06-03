package harshita02_03;

import java.util.Scanner;

public class SwitchStatementExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//switch :- option based problem solve kerne ke liye....
		
		/*
		 *   switch(option...)
		 *   {
		 *   
		 *   		case 1:
		 *   			Statement....
		 *   			break...
		 *   
		 *   		case 2:
		 *   			statement....
		 *   			break....
		 *   		.
		 *   		.
		 *   		.
		 *   
		 *   		default:
		 *   			statement....
		 *   			break...
		 *   }
		 * 
		 * 
		 * 
		 * */
		
//		int num = 100;
//		
//		switch(num) {
//			case 100:
//				System.out.println("equal to 100...");
//				break;
//				
//			case 200:
//				System.out.println("equal to 200...");
//				break;
//				
//			case 300:
//				System.out.println("equal to 300...");
//				break;
//				
//			case 400:
//				System.out.println("equal to 500...");
//				break;
//				
//			default:
//				System.out.println("your option not matched...");
//				break;
//		}
		
//		int num = 400;
//		
//		switch(num) {
//			case 100:
//				System.out.println("equal to 100...");
////				break;
//				
//			case 200:
//				System.out.println("equal to 200...");
////				break;
//				
//			case 300:
//				System.out.println("equal to 300...");
////				break;
//				
//			case 400:
//				System.out.println("equal to 500...");
////				break;
//				
//			default:
//				System.out.println("your option not matched...");
//				break;
//		}
		
		// even-odd...
		
//		int num = 5;
//		
//		if(num%2==0) {
//			System.out.println("even");
//		}else {
//			System.out.println("odd");			
//		}
		
//		int num = 21;
//		switch(num%2) {
//			case 0:
//				System.out.println("number is even...");
//				break;
//				
//			default:
//				System.out.println("number is odd...");
//				break;
//		}
		
		/*  switch in nested form :- 
		 * 
		 * 
		 *  switch(option1){
		 *  	case 1:
		 *  		switch(option2){
		 *  			case 1:
		 *  				statement...
		 *  				break...
		 *  			.
		 *  			.
		 *  			.
		 *  			default:
		 *  				statement..
		 *  				default...
		 *  		}
		 *  		break...
		 *  
		 *  	case 2:
		 *  		statement...
		 *  		break...
		 *  	.
		 *  	.
		 *  	.
		 *  	default:
		 *  		statement...
		 *  		break...
		 *  
		 *  } 
		 * 
		 * 
		 * 
		 * */
		
		// num divisibility 3,5...
//		int num = 15;
//		switch(num%3) {
//			case 0:
//				switch(num%5) {
//					case 0:
//						System.out.println("divisible by both...");
//						break;
//						
//					default:
//						System.out.println("only divisible by 3");
//						break;
//				}
//			break;	
//				
//			default:
//				switch(num%5) {
//					case 0:
//						System.out.println("only divisible by 5");
//						break;
//						
//					default:
//						System.out.println("not divisible by 3 and 5...");
//						break;
//				}
//		}
		
		
		// user input... check it is  f,F,w,W,i,I...
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter your favorite social media app..");
//		char c = sc.next().charAt(0);
//		
//		
//		switch(c) {
//			case 'f' :
//			case 'F' :	
//				System.out.println("facebook");
//				break;
//				
//			case 'w' :
//			case 'W' :	
//				System.out.println("whatsapp");
//				break;
//				
//			case 'i':
//			case 'I':	
//				System.out.println("instagram");
//				break;
//				
//			default:
//				System.out.println("nothing");
//				break;
//		}
		
		
		
		

	}

}
