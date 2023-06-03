package class05_06pm;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//before array...
		
//		int a=10;
//		int b=20;
//		int c=30;
//		int d=40;
//		int e=50;
		
		//array... 
		// limitation        => collection of similar dataType elements....
		//		             => size fixed....
		/*   Syntax =>
		 * 	                    1  2  3  4  5    <= length
					int ar[] = {10,20,30,40,50};
								0  1  2  3  4    <= index/size
								
								size of array = (length - 1)
								
			declaration of array...
			
								(1) int arr[] = {2,9,3,8,4,7};
								(2) int arr[] = new int[5];
								
			array types :- single dimensional, multidimensional, jagged array 					
								
		*/
		
		//single dimensional array...
		
//		int ar[] = new int[6];
//		
//		ar[0] = 90;
//		ar[1] = 30;
//		ar[2] = 45;
//		ar[3] = 9;
//		ar[4] = 3;
//		ar[5] = 5;
		
//		System.out.println(ar[0]);
//		System.out.println(ar[1]);
//		System.out.println(ar[2]);
		
//		for(int i=0; i<=5; i++) {
//			System.out.println(ar[i]);
//		}
		
//		int ar[] = {23,94,85,76};
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			System.out.println(ar[i]);
//		}		
		
		
		//ascending, descending, maximum, smallest, secondMaximum
		
		//ascending and descending
//		int ar[] = {2,3,9,4,8,5,7,6};
//		int temp;
		
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=i; j<=ar.length-1; j++) {
//				if(ar[i]>ar[j]) {
//					temp=ar[i];
//					ar[i]=ar[j];
//					ar[j]=temp;
//				}
//			}
//			System.out.print(ar[i]+" ");
//		}
		
		//maximum...
		
//		int ar[] = {2,3,9,4,8,5,7,6};
//		int max = 0;
//		
//		for(int i=0; i<=ar.length-1; i++) {
//		
//				if(ar[i]>max) {// 2>0|3>2|9>3|4>9|8>9|5>9|7>9|6>9
//					max=ar[i];//max=2|3|9
//				}
//		
//		}
//		System.out.println(max);
		
//		int ar[] = {2,3,9,4,8,5,7,6};
//		
//		int small = ar[0];
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			if(ar[i]<small) {
//				small=ar[i];
//			}
//		}
//		System.out.println(small);
		
		//merge two array...{1,2,3,4,5,6}
		
//		int ar1[] = {1,2,3};
//		int ar2[] = {4,5,6};
		
		//add two array...{5,7,9}

	
//		int ar1[] = {1,2,3};   //3
//		int ar2[] = {4,5,6};   //3
//		int ar3[] = new int[ar1.length+ar2.length];   //6
//		
//		//first array elements...		
//		for(int i=0; i<=ar1.length-1; i++) { //3
//			ar3[i] = ar1[i];
//		}
//
//		for(int i=0; i<=ar3.length-1; i++) {
//			System.out.print(ar3[i]+" ");
//		}
//		
//		//second array elements...
//		for(int i=0; i<=ar2.length-1; i++) {
//			ar3[ar1.length + i] = ar2[i];
//		}
//		
//		System.out.println();
//		
//		for(int i=0; i<=ar3.length-1; i++) {
//			System.out.print(ar3[i]+" ");
//		}

		
		//addition...
		
		//second Maximum......
		
		
//		int ar[] = {15,8,4,7,3,16};
//		
//		int max = 0;
//		int secMax = 0;
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			if(ar[i]>max) {
//				secMax = max;
//				max = ar[i];
//			}else if(ar[i]>secMax && ar[i]<max){
//				secMax = ar[i];
//			}
//		}System.out.println("max = "+ max + " secMax = "+ secMax);
		
		
		
		
		
	//============================================================
		
		
		/*   multidimensional syntax:-
		 * 
		 * 		int ar[] = new int[5];
		 * 
		 * 2D array:-
		 *    int ar[r][c] = new int[2][2];
		 *  
		 *  	int ar[][] = {{1,2},{3,4}};
		 *  
		 * 	i=0	1 2
		 *  i=1 3 4	 
		 *      j j
		 *      0 1
		 *
		 *3D array:-
		 *
		 *  int ar[][][] = {{},{},{}};
		 *  
		 *  
		*/
		
		
		
		
		
		
		
//		int ar[][] = {{1,2},{3,4}};
//		
//		for(int i=0; i<=ar.length-1; i++) {      //i=0
//			for(int j=0; j<=ar.length-1; j++) {  //j=0,1
//				System.out.print(ar[i][j]+" ");  //ar[0][0],ar[0][1]
//			}
//			System.out.println();
//		}
		
//		int ar[][] = {{1,2},{3,4}};
//		int max=0;
//		
//		for(int i=0; i<=ar.length-1; i++) {      //i=0
//			for(int j=0; j<=ar.length-1; j++) {  //j=0,1
//				System.out.print(ar[i][j]+" ");  //ar[0][0],ar[0][1]
//			}
//			System.out.println();
//		}
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			for(int j=0; j<=ar.length-1; j++) {
//				if(max<ar[i][j]) {
//					max=ar[i][j];
//				}
//			}
//		}System.out.println(max);
		
		
		
		
		//ascending increasing order...
		
		
//		        int[][] ar = {{11, 2}, {13, 4}};
//		        for(int i=0; i<=ar.length-1; i++) {
//		        	for(int j=0; j<=ar.length-1; j++) {
//		        		System.out.print(ar[i][j]+" ");
//		        	}
//		        	System.out.println();
//		        }
		        // Sort each inner array individually
//		        for (int i = 0; i < ar.length; i++) {
//		            for (int j = 0; j < ar[i].length - 1; j++) {
//		            	for (int k = 0; k < ar[i].length - j - 1; k++) {
//		                    if (ar[i][k] > ar[i][k + 1]) {
//		                        // Swap elements
//		                        int temp = ar[i][k];
//		                        ar[i][k] = ar[i][k + 1];
//		                        ar[i][k + 1] = temp;
//		                    }
//		                }
//		            }
//		        }

		        // Print the sorted multidimensional array
//		        for (int[] innerArray : ar) {
//		            System.out.println(Arrays.toString(innerArray));
//		        }
//		        for(int i=0; i<=ar.length-1; i++) {
//		        	for(int j=0; j<=ar.length-1; j++) {
//		        		System.out.print(ar[i][j]+" ");
//		        	}
//		        	System.out.println();
//		        }
//		    }
		
		//======================================
		
		//3D array....
		
		//int ar[][][] = {{{1,2,3}},{{4,5,6}},{{7,8,9}}};
		
//		int ar[][][] = new int[2][2][2];
//		ar[0][0][0] = 1;
//		ar[0][0][1] = 2;
//		System.out.println(ar[0][0][0]);
//		System.out.println(ar[0][0][1]);
		
//		for(int i = 0; i<=ar.length-1; i++) {
//			for(int j = 0; j<=ar[i].length-1; j++) {
//				for(int k=0; k<=ar[j].length-1; k++) {
//					System.out.print(ar[i][j][k]+" ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
//		int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
//		 
//        for (int i = 0; i < 2; i++)
//        {    for (int j = 0; j < 2; j++)
//        		{ for (int z = 0; z < 2; z++)
//        			{	 
//        			System.out.print(arr[i][j][z]+" ");
//        			}
//        		}
//        System.out.println();
//        }
        
		
		//====================
		
		//jagged array...
		
		
//		int ar[][] = new int[3][];
//		ar[0] = new int[3];
//		ar[1] = new int[4];
//		ar[2] = new int[2];
//
//		Scanner sc = new Scanner(System.in);
//		
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<ar[i].length; j++) {
////				System.out.print(ar[i][j]+" ");
//				ar[i][j]=sc.nextInt();
//			}
//			System.out.println();
//		}
//		for(int i=0; i<3; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				System.out.print(ar[i][j]+" ");
////				ar[i][j]=sc.nextInt();
//			}
//			System.out.println();
//		}
		
		
//===========================
		
		//similar type elements....
		
		// int ar[] = {34,3,4,3};
		
		// int ar[] = new int[4];
		
		//Object
		
		
		
//		Object ar[] = {12, 1.2f, 12.23, true, 'x', "xxx"};
//		
//		for(int i=0; i<=ar.length-1; i++) {
//			System.out.print(ar[i]+" ");
//		}
		
        }
}

