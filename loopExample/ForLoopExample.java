package loopExample;

public class ForLoopExample {

	public static void main(String[] args) {

		//forward...
		
//		for(int i=1; i<=10; i++) {
//			System.out.println(i);
//		}
//		for(int i=1; i<=10; i++) {
//			System.out.print(i+" ");
//		}
		
		//backward...
		
//		for(int i=10; i>=1; i--) {
//			System.out.println(i);
//		}
//		for(int i=10; i>=1; i--) {
//			System.out.print(i+" ");
//		}
		
		//table of 5...
//		int num=5;
//		for(int i=1; i<=10; i++) {
//			System.out.println(num+" * " + i+" = "+i*num);
//		}
		
//		int num = 5;
//		for(int i = 10; i>=1; i--) {
//			System.out.println(num+" * " + i+" = "+i*num);
//		}
		
		//fibonacci series... 0 1 1 2 3 5 8 13 21....
//		int a=0,b=1,c;
//		int num = 5;
//		for(int i=0; i<=num; i++) {
//			System.out.print(a+" ");
//			c = a+b;
//			a=b;
//			b=c;
//			
//		}
		
		//modification in for loop...
//		int i=0;
//		for( ;i<=5;) {
//			System.out.println(i);
//			i++;
//		}
		
		//nested for loop....
		
		//outer loop..
//		for(int i=1; i<=4; i++) {
//			//inner loop..
//			for(int j=1; j<=4; j++) {
//				System.out.print(i+" "+j+" ");
//			}
//			System.out.println();
//		}
		
		/*
		 *  *
		 *  * *
		 *  * * *
		 *  * * * *
		 *  1
		 *  1 2
		 *  1 2 3
		 *  1 2 3 4
		 *  1 2 3 4 5
		 *  
		 *  1 2 3 4 5
		 *  1 2 3 4
		 *  1 2 3
		 *  1 2
		 *  1
		 *  
		 *  5 5 5 5 5 
			4 4 4 4 
			3 3 3 
			2 2 
			1
			(lower case a=97 to z=122)
			(upper case A=65 to Z=90)
			A
			A B
			A B C
			A B C D
			A B C D E
			
		 * */
		
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
////				System.out.print(j +" ");
//				System.out.print("*"+" ");
//			}
//			System.out.println();
//		}
		
//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				//System.out.print(i+" ");
//				System.out.print(j+" ");
//			}System.out.println();
//		}
		
//		for(int i=65; i<=69; i++) {
//			for(int j=65; j<=i; j++) {
//				System.out.print((char)j+" ");
//			}System.out.println();
//		}
		
		
		//factorial...
		
//		int num = 5;
//		
//		int fact = 1;
//		for(int i=1; i<=num; i++) {
//			fact = fact*i; //5*4*3*2*1 
//			//fact(1)*i(1)=1=fact
//			//fact(1)*i(2)=2=fact
//			//fact(2)*i(3)=6=fact
//			//fact(6)*i(4)=24=fact
//			//fact(24)*i(5)=120=fact
//		}
//		System.out.println(fact);
		
		/*
		 * (i=69)  A B C D E
			(i=68) a b c d
			(i=67) A B C
			(i=66) a b
			(i=65) A
			
			
			
			    *
			   * *
			  * * *
			 * * * *
			* * * * *
			 * * * *
			  * * *
			   * *
			    * 
			
			*
			# *
			* # *
			# * # *
			* # * # *
			 
			 
			* # * # *
			# * # *
			* # * 
			# *
			*
			
			*/
		
		
//		for(int i=69; i>=65; i--) {
//			for(int j=65; j<=i; j++) {
//				//i==even 
//				if(i%2==0) {
//					//a,b,c,d
//					System.out.print((char)(j+32)+" ");	
//				}
//				//i==odd
//				else {
//					//A,B,C,D
//					System.out.print((char)j+" ");
//				}
//				
//			}
//			System.out.println();
//			
//		}
		
		
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
		
//		for(int i=5; i>=1; i--) {
//			for(int j=1; j<=i; j++) {
//				if((i+j)%2==0) {
//					System.out.print("* ");
//				}else {
//					System.out.print("# ");
//				}
//			}System.out.println();
//		}
		//diamond patter
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=5-i; j++) {
//				System.out.print(" ");
//			}
//			for(int k=1; k<=i; k++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		for(int i=4; i>=1; i--) {
//			for(int k=5-i; k>=1; k--) {
//				System.out.print(" ");
//			}
//			for(int j=1; j<=i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		
		
		//=============
		
//		        int n = 5;
//		        for (int i = 1; i <= n; i++) {
//		            for (int j = n; j > i; j--) {
//		                System.out.print(" ");
//		            }
//		            for (int k = 1; k <= i; k++) {
//		                System.out.print("* ");
//		            }
//		            System.out.println();
//		        }
//		        for (int i = n - 1; i >= 1; i--) {
//		            for (int j = n; j > i; j--) {
//		                System.out.print(" ");
//		            }
//		            for (int k = 1; k <= i; k++) {
//		                System.out.print("* ");
//		            }
//		            System.out.println();
//		        }
//		    }
		

		
		
		
	

}
}