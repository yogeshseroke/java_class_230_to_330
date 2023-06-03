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
		 * 		*
		 *     * *
		 *    * * *
		 *   * * * *
		 *    * * *
		 *     * *
		 *      *
		 *
		 *  
		 * */
		
//		for(int i=0; i<=4; i++) {
//			for(int j=0; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		//==========================================		
//	for(int i=0; i<=4; i++) {
//		for(int k=0; k<4-i; k++) {
//			System.out.print(" ");
//		}
//		for(int j=0; j<=i; j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
//	
//	for(int i=3; i>=0; i--) {
//		for(int k=0; k<4-i; k++) {
//			System.out.print(" ");
//		}
//		for(int j=0; j<=i; j++) {
//			System.out.print("* ");
//		}
//		System.out.println();
//	}
	//==========================================
		/*
		 * 
		 *  i=0 *
		 *  i=1 # *
		 *  i=2 * # *
		 *  i=3 # * # *
		 *  i=4 * # * # *
		 *      j j j j j
		 *      0 1 2 3 4
		 *      
		 *      (i+j)%2==0, *
		 *      (0+0)%2
		 *      (1+1)%2
		 *      (2+0)
		 *      (2+2)
		 * 
		 * */
//		for(int i=0; i<=4; i++) {
//			for(int j=0; j<=i; j++) {
//				if((i+j)%2==0) {
//					System.out.print("* ");
//				}else {
//					System.out.print("# ");
//				}
//				
//			}System.out.println();
//		}
		
		
		//===============================
		
		//(2)while loop....
		
		/*
		 *     syntax:- 
		 *     			initialization.....
		 *     			while(condition....){
		 *     				
		 *     				statement....
		 *     				increment....
		 *    			}
		 * 
		 * */
		
//		int i=1;
//		while(i<=10) {
//			System.out.println(i);
//			i++;
//		}
		
		//=================
//		int num=5;
//		int i=1;
//		while(i<=10) {
//			System.out.println(i*num);
//			i++;
//		}
		
		//fact, fibonacci, prime, armstrong....
		//patterns....
		
		//prime..
//		int num=5;
//		int i=1,count=0;
//		while(i<=num) {
//			if(num%i==0) {
//				count++;
//			}
//			i++;
//		}
//		if(count==2) {
//			System.out.println("prime");
//		}else {
//			System.out.println("not a prime");			
//		}
		
		//armstrong...
		
//		int num = 370;
//		
//		int temp = num;//370
//		
//		int r,arm=0;
//		
//		while(num!=0) {          //(370!=0)|(37!=0)|(3!=0)|(0!=0)
//			r = num%10;          // r = 370%10 ---> 0| r(7) |r(3) 
//			num = num/10;        // 37| 3 | 0
//			arm = arm + (r*r*r); // 0| 343 | 343 + 27 = (arm)370
//			
//		}
//		if(arm==temp) {
//			System.out.println("Armstrong number...");
//		}else {
//			System.out.println("Not a armstrong number...");
//		}
		
		
		//================
		
		//do-while loop....
		
		
		/*
		 * 
		 *        syntax :- exit control
		 *      
		 *       (1) initialization.....
		 *       (2)do
		 *          {
		 *          (2.1)statement...
		 *          (2.2)increment...
		 *        
		 *        }(3)while(condition...);
		 * 
		 * */
		
		
//		int i=1;
//		
//		do {
//			System.out.println(i);//1
//			i++;//2
//		}while(i>=5);//false
		
		
		
		//factorial...
		
//		int num=5,i=1;
//		int temp=num;
//		do {
//			num=num*i;
//			System.out.println(num);
//			i++;
//		}while(i<temp);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
