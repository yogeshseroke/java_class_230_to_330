package loopExample;

public class whileLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//while syntex
//		initialization..
//		while(condition) {
//			statement....;
//			increment++;
//		}
		
//		int i=1;
//		
//		while(i<=10) {
//			System.out.print(i+" ");
//			i++;
//		}
		
		//factorial...
//		int fact=1;
//		int num=5;
//		while(num>0) {
//			
//			fact = fact * num;
//			num--;
//			
//		}System.out.println(fact);
//		int i=1;
//		while(i<=5) {
//			
//			fact = fact * i;//1*1(1)/1*2(2)/2*3(6)/6*4(24)/24*5(120)
//			i++;
//			
//		}System.out.println(fact);
		
		
		//table of any number...
//		int i=1;
//		int num=2;
//		while(i<=10) {
//			num=num*i;
//			//System.out.println(num*i);
//			i++;
//		}System.out.println(num);
		
		
		//sum of 1 to 10 numbers....
//		int i=1;
//		int sum=0;
//		while(i<=10) {
//			System.out.println(i);
//			sum = sum + i;//(0+1)1/(1+2)3/(3+3)6/(6+4)10/(10+5)15/(15+6)21/(21+7)28/(28+8)36/(36+9)45/(45+10)55
//			i++;
//		}System.out.println("sum of = "+ sum);
		
		//fibonacci series....
//		int i=1;
//		int a=0,b=1,c=0;
//		while(i<=5) {
//			System.out.print(a+" ");
//			c=a+b;
//			a=b;
//			b=c;
//			i++;
//			
//		}
		
		int i=0;
		//int j=0;
		while(i<5) {
			int j=0;
			while(j<=i) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}
		
		
		
	}

}
