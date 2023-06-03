package lambdaExpression;

public class DrwableClass {

	public static void main(String args[]) {
		
		int width = 10;
		
		//without lambda function, Drawable interface implementation using anonymous class
		
//		Drawable d = new Drawable() {
//			public void draw() {
//				System.out.println("Drawing "+ width);
//				}
//		};
//		
//		d.draw();
		
		//with lambda function
		
//		Drawable d = () -> {
//			System.out.println("Drawing "+ width);
//		};
//		
//		d.draw();
	}
}
