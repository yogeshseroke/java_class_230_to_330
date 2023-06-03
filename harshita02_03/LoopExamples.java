package harshita02_03;

import java.beans.Statement;

public class LoopExamples {

	public static void main(String[] args) {
		
//		int a = 1;
//		int b = 2;
//		int c = 3;
//		int d = 4;
//		int e = 5;
//		
//		int x;//delcaration
//		x=10;//initialization
		
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
		
		
		//Loops :- control structure....statement repeated
		
		/*
		 * 		type :- (1)Entry control:-(for, while) (2)Exit control(do-while)
		 *  
		 * 	   syntax :- 
		 * 
		 * 		(1) for loop :- 
		 * 
		 *   				for((1)initialization; (2)condition; (4)iteration)
		 * 					{
		 * 
		 * 						(3)statement....
		 * 					}
		 * 							
		 * ================================================================
		 * 
		 * 		(2) while :- 
		 * 					(1)initialization...
		 * 
		 * 					while((2)condition....){
		 * 							(3)statement...
		 * 							(4)iteration....
		 * 						
		 * 					}
		 * =================================================================
		 * 
		 * 		(3) do-while :-
		 * 
		 * 					do{
		 * 						statement...
		 * 						iteration...
		 * 					}while(condition....);
		 * */
		
		//forward direction....
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
		
		//backward direction....
//		for(int i=10; i>=1; i--) {
//			System.out.println(i);
//		}
		
		//table of 2...
//		int num = 2;
//		for(int i=1; i<=10; i++) {
//			System.out.println(num*i);
//		}
		
//		int num = 5;
//		for(int i=10; i>=1; i--) {
//			System.out.println(num*i);
//		}
		
		//prime number.... 5/1, 5/5
		
//		int num = 11;
//		int count = 0;
//		for(int i=1; i<=num; i++) {
//			if(num%i==0) {//6/1=0, 6/2=0, 6/3=0, 6/6=0
//					count++;//1, 2, 3, 4
//			}
//		}
//		if(count==2) {
//			System.out.println("prime");
//		}else {
//			System.out.println("not prime");
//		}
		
		//factorial... 5 = 5*4*3*2*1 = 120
		
//		int num = 5;
//		
//		int fact=num;//5
//		
//		for(int i=1; i<fact; i++) {
//			num =  (num * i);//5, 10, 30, 120
//		}
//		
//		System.out.println(num);
		
		//fibonacci series... 0 1 1 2 3 5 8 21
		/*
		 *      0 1 1 2 3 5
		 *        
		 *      a b = c
		 *		0 1 = 1
		 *      1 1 = 2
		 *      1 2 = 3
		 *      2 3 = 5
		 *      3 5 = 8
		 *      5 8 = 13     
 		 * 
		 * */
		
//		int a=0,b=1,c=0;
//		
//		for(int i=1; i<8; i++) {
//			System.out.print(a+" ");
//			c = a + b;//1
//			a = b;//1
//			b = c;//1
// 		}
		
		//armStrong number... 153 = (1)3 + (5)3 + (3)3 = 1 + 125 + 27 = 153
		
//		int num = 153;
//		int temp = num;//153
//		int lenght = String.valueOf(num).length();//3
//		int r;
//		int armstrong=0;
//		
//		for(int i=0; i<lenght; i++) {
//			//i=0<3
//			//i=1<3
//			//i=2<3
//			
//			r = num%10;	//r=3,5
//			//(153%10)=3
//			//(15%10)=5
//			//(1%10)=1
//			
//			num = num/10;  
//			// (153/10) => 15,
//			//(15/10) => 1
//			
//			armstrong = armstrong  + (r*r*r); //27
//			// 0  + (3*3*3)=>27
//			// 27  + (5*5*5)=>152
//			// 152 + (1*1*1)=>153
//		}
//		   // 153 == 153
//		if(armstrong == temp) {
//			System.out.println("Armstrong");
//		}else {
//			System.out.println("not a armstrong");
//		}
		
	//=========================================================
		
		
		//nested for loop....
		
		/*
		 *   for(){
		 *   	
		 *   	for(){
		 *   
		 *   	}
		 *   
		 *   }
		 * 
		 * */
		
		//patterns....
		
		/*
		 * 
		 *   i=1   1 2 3 4 5
		 *   i=2   1 2 3 4 5
		 *   i=3   1 2 3 4 5
		 *   i=4   1 2 3 4 5
		 *   i=5   1 2 3 4 5
		 *   
		 * 	       j j j j j
		 *         1 2 3 4 5
		 * */
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		/*
		 * 
		 *   i=1   1 
		 *   i=2   1 2 
		 *   i=3   1 2 3 
		 *   i=4   1 2 3 4 
		 *   i=5   1 2 3 4 5
		 *   
		 * 	       j j j j j
		 *         1 2 3 4 5
		 * */
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		/*
		 * 
		 *   i=1   * * * * *
		 *   i=2   * * * * *
		 *   i=3   * * * * *
		 *   i=4   * * * * *
		 *   i=5   * * * * *
		 *   
		 * 	       j j j j j
		 *         1 2 3 4 5
		 * */
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		/*
		 * 
		 *   i=1   * 
		 *   i=2   * * 
		 *   i=3   * * * 
		 *   i=4   * * * * 
		 *   i=5   * * * * *
		 *   
		 * 	       j j j j j
		 *         1 2 3 4 5
		 * */
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		/*
		 * 
		 *     * * * * * 
		 *     * * * *
		 *     * * *
		 *     * *
		 *     *
		 *     
		 *     1 2 3 4 5
		 *     1 2 3 4
		 *     1 2 3
		 *     1 2
		 *     1
		 *
		 *	i=1		*
		 *  i=2     # *
		 *  i=3    	* # *
		 *  i=4    	# * # *
		 *  i=5    	* # * # *
		 *   		j j j j j
		 *   		1 2 3 4 5
		 *   i,j => (i+j)%2==0  , even = *, odd = # 
		 *   1,1 => (1+1)
		 *   2,2 => (2+2)
		 *   3,1 => (3+1)
		 *   3,3
		 *   4,2
		 *   4,4
		 *   5,1
		 *   5,3
		 *   5,5   
		 *==============================      
		 *
		 *     	*
		 *     * *
		 *    * * *
		 *   * * * *
		 *    * * *
		 *     * *
		 *      *
		 *
		 *      * # * # * # *
		 *      # * # * # *
		 *      * # * # *
		 *      # * # *
		 *      * # *
		 *      # *
		 *      *
		 *      
		 *      
		 *      * * * * i=0
		 *      *     * i=1
		 *      *     * i=2
		 *      * * * * i=3
		 *      
		 *      j j j j 
		 *      0 1 2 3 
		 *      
		 *      (i==2 || i==3 || i==4 || j==1 || j==5) => *
		 * */
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				if((i+j)%2==0) {
//					System.out.print("* ");
//				}else {
//					System.out.print("# ");
//				}
//			}
//			System.out.println();
//		}
		
		//=========================================
		
//		int r=4;
//		int c=4;
//		for(int i=0; i<r; i++) {
//			for(int j=0; j<c; j++) {
//				if(i==0 || i==r-1 || j==0 || j==c-1) {
//					System.out.print("*");
//				}else {
//					System.out.print(" ");
//				}
//			}
//			System.out.println();
//		}
		//===========================================
		
/*
 * 			0 1 2 3
 *			j j j j
 *
		       *    i=0
		      * *   i=1
		     * * *  i=2
		    * * * * i=3
		    k k k k 
		    0 1 2 3 
		     
		     
		     * * * i=2
		      * *  i=1
		       *   i=0
		     
		     
*/
		
//		for(int i=0; i<4; i++) {
//			for(int k=0; k<=5-i; k++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=4; i>=0; i--) {
//			for(int k=0; k<=5-i; k++) {
//				System.out.print(" ");
//			}
//			for(int j=0; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
	
		/*
		 *       a
		 *       a b
		 *       a b c
		 *       a b c d
		 * 
		 *       A
		 *       A B
		 *       A B C
		 *       A B C D
		 *       
		 *       A
		 *       a b
		 *       A B C
		 *       a b c d
		 *       
		 *       a
		 *       A B
		 *       a b c
		 *       A B C D
		 *       
		 * */
		//a to z => ascii code a=97 
		//A to Z => ascii code A=65
//		for(char i='a'; i<='d'; i++) {
//			for(char j='a'; j<=i; j++) {
//				System.out.print(j+" ");
//			}
//			System.out.println();
//		}
		
		//===================
//		for(int i=97; i<=100; i++) {
//			for(int j=97; j<=i; j++) {
//				System.out.print((char)j+" ");
//			}
//			System.out.println();
//		}
		
		//=================================================
		
		//while loop....
		
		//forward
		
//		int i=0;//initialization....
//		
//		while(i<=10) {//condition
//			System.out.println(i);//statement
//			i++;//increment
//		}
		
//		int i=10;//initialization....
//		
//		while(i>=0) {//condition
//			System.out.println(i);//statement
//			i--;//increment
//		}
		
		//prime...
		
//		int num = 70;
//		int i=1;
//		int count=0;
//		while(i<=num) {
//			if(num%i==0) {
//				count ++;
//			}
//			i++;
//		}
//		
//		if(count==2) {
//			System.out.println("prime");
//		}else {
//			System.out.println("not prime");
//		}
		
		
		//armstrong number...
		
//		int num = 153, r=0;
//		int temp=num;
//		int arm=0;
//		while(num!=0) {
//			r = num%10;
//			num= num/10;
//			
//			arm = arm + (r*r*r);
//			
//		}
//		
//		if(arm == temp) {
//			System.out.println("armstrong number");
//		}else {
//			System.out.println("not an armstrong number...");
//		}
		
		//patterns using while loop .....
		
		/*
		 *     * * * *
		 *     * * * *
		 *     * * * *
		 *     * * * *
		 * */
		//outer while loop...
//		int i=0;
//	
//		while(i<4)
//		{
//			//statement....
//			//inner while loop
//			int j=0;
//			
//			while(j<4) {
//				System.out.print("* ");
//				j++;
//			}
//			
//			i++;
//			System.out.println();
//		}
		
		//==================================================
		
		//do-while...
		
//		int i=1; //initialization...
//		
//		do {
//			System.out.println(i);//statement...
//			i++;//increment...
//		}while(i>=5);
	}

}
