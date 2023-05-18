package class05_06pm;

public class LoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		int a=1;
//		int b=2;
//		int c=3;
//		int d=4;
//		int e=5;
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
		
		
		//loops :- entry control[(1)for (2)while], exit control[(3)do-while]
		
		//for loop
		/*
		 * 
		 *     syntext:- for((1)initialization; (2)condition; (4)iteration){
		 *     						(3)statement...
		 *     				}
		 * 
		 * 				for(int i=1; i<=5; i++){
		 * 						System.out.println(i);
		 * 					}
		 * 
		 * 
		 * 
		 * */

		//forward direction.... ++
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		//bacward direction.... --
//		for(int i=10; i>=1; i--) {
//			System.out.println(i);
//		}
		
		// Table of any given number...
//		int num = 2;
//		for(int i=1; i<=10; i++) {
//			System.out.println(i*num);//2,4,6... 
//		}
		
//		int num = 5;
//		for(int i=10; i>=1; i--) {
//			System.out.println(i*num);
//		}
		
		//factorial...num=5 => 5*4*3*2*1 = 120
		
//		int num = 5;
//		int fact = 0;
//		for(int i=1; i<5; i++) {
//			num=num * i;
//		}System.out.println(num);
	
			//prime
		
//		int i,count=0;
//		int num = 6;
//		for(i=1; i<=num; i++) {
//			if(num%i==0) {     //6%1=0, 6%2=0, 6%3=0, 6%4!=0, 6%5!=0, 6%6=0
//				count++;       //1,2,3,4
//			}
//		}
//		if(count==2) {
//			System.out.println("Prime");
//		}else {
//			System.out.println("Not a prime");
//		}

		//fibonacci series.... 0 1 1 2 3 5 8 13.....
		
//		int a=0,b=1,c;
//		
//		for(int i=0; i<=20; i++) {
//			System.out.print(a+" ");
//			
//			c=a+b;
//			a=b;
//			b=c;
//		//	System.out.print(c+" ");
//		}
		
		//Armstrong number... 153=(1)3 + (5)3 + (3)3
		
//		int num = 370;//num.length
//		int l=String.valueOf(num).length();//3
//		int temp=num;
//		int r,arm=0;
//		
//		for(int i=1; i<=l; i++) {
//			r = num % 10;//3
//			num=num/10;//15,1
//			
//			arm = arm +(r*r*r);//0=0+27,27= 27+125, 152 = 152 + 1
//		}
//		
//		
//		if(arm==temp) {
//			System.out.println("Armstrong number..");
//		}else {
//			System.out.println("Not a armstrong number..");
//		}
		
		
		//Nested for loop...
		//patterns...
		
		
		/*
		 *     *
		 *     * *
		 *     * * *
		 *     * * * *
		 *     
		 * 	   * * * *
		 *     * * *
		 *     * *
		 *     *
		 * 
		 * 		1
		 * 		1 2
		 * 		1 2 3
		 * 		1 2 3 4
		 * 
		 *		1 2 3 4
		 *		1 2 3
		 *		1 2
		 *		1	 
		 * 
		 * 
		 * */
		
//		for(int i=0; i<=4; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
	
	
	}

}
