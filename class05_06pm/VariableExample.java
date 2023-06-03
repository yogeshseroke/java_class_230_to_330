package class05_06pm;

public class VariableExample {

			//global variable...
			//dynamic 
			int a = 10;
			int b = 20;
			
			//local variable....
			//dynamic...
			void display() {
				 int x=1;
				 int y=2;
				System.out.println("(local dynamic) x = "+x+" y = "+y);
		
			}
			
			
			//global variable...
			//static
			static int j=100;
			
			static void display1() {
				int k=200;
				System.out.println("(local static) k = "+k);
			} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			//constant...
		
		final int z = 10;
		
		System.out.println("original value of z = "+z);
		
		//z = 20;
		System.out.println("new value of z = "+z);
	}

}
