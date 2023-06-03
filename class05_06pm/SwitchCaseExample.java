package class05_06pm;

import java.beans.Statement;
import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		switch(option) {
//		case 1:
//			statement....
//			break;
//			
//		case 2:
//			statement....
//			break;
//
//		case 3:
//			statement....
//			break;
//
//			default :
//				Statement....
//				break;
//		}

	
//		int a = 4;
//		
//		switch(a) {
//			case 1:
//				System.out.println("a = 1");
//				break;
//			
//			case 2:
//				System.out.println("a = 2");
//				break;
//			
//			case 3:
//				System.out.println("a = 3");
//				break;
//				
//			default :
//				System.out.println("nothing...");
//				break;
//		}
	
		
		//without break....
		
//		int a = 2;
//		switch(a) {
//		case 1:
//			System.out.println("a = 1");
//			
//		
//		case 2:
//			System.out.println("a = 2");
//			
//		
//		case 3:
//			System.out.println("a = 3");
//			
//			
//		default :
//			System.out.println("nothing...");
//			
//		}
		
		//WAP for check whether option match or not....
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("choose between F,I,W");
//		char c = sc.next().charAt(0);
//		//F-f, i-I, W-w
//		
//		switch(c) {
//			case 'F':
//			case 'f':
//				System.out.println("FaceBook...");
//				break;
//				
//			case 'I':
//			case 'i':
//				System.out.println("Instagram...");
//				break;	
//				
//			case 'W':
//			case 'w':
//				System.out.println("WhatsApp...");
//				break;	
//				
//			default:
//				System.out.println("please type any of these....F-f, i-I, W-w");
//				break;
//		}
		
		//even-odd....
		
//		int num = 21;
//		
//		switch(num%2) {
//		   case 0:
//			   System.out.println("Even");
//			   break;
//			   
//		   default :
//			   System.out.println("Odd");
//			   break;
//		}
		
		//find any number will be divisible by 3/5/7 or both...
		//nested switch-case...
//		int num = 5;
//		
//		switch(num%3) {
//		case 0:
//			switch(num%5) {
//			case 0:
//				
//				System.out.println("divisible by 3 and 5");
//				break;
//				
//				default :
//					System.out.println("divisible by 3");
//			}
//			
//			break;
//			
//		default :
//			System.out.println("not divisible by 3");
//			break;
//		}
		
		//leap year... (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
//		
//	 int year = 2023;
//	 
//	 switch(year%4) {
//	 	case 0:
//	 		switch(year%100) {
//	 		case 0:
//	 			System.out.println("not a leap year, because it is divisible by 100");
//	 			break;
//	 			
//	 			default:
//	 				System.out.println("leap year, because it is not divisible by 100, because it is divisible by 4");
//	 			
//	 		}
//	 		break;
//	 		
//	 	default:
//	 		switch(year%400) {
//	 		case 0:
//	 			System.out.println("leap year, because it is divisible by 400");
//	 			break;
//	 			
//	 		default :
//	 			System.out.println("not a leap year..., because it is not divisible by 400");
//	 			break;
//	 		}
//	 }
		
		
	}

}
