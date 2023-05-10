package class05_06pm;

public class TypeCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//boxing or implicit type conversion...
		
//		int a = 10;
//		System.out.println(a);
//		Object o = a;
//		System.out.println(o);
//		
		//unboxing or explicit type conversion...
		
//		Object o = 120;
//		System.out.println(o);
//		int a = (int) o;
//		
//		System.out.println(a);
		
		//autoboxing...
		
//		int a = 300;
//		Integer i = a;
//		
//		Integer i1 = new Integer(a);
//		
//		System.out.println(i+" "+i1);
//		
//		Integer i2 = 10;
//		int a2 = i2;
//		System.out.println(a2);
		
		int num = 756;
		int reminder1;
		reminder1 = num%10;  //6
		num = num/10; // 75
		
		int reminder2;
		reminder2 = num%10; //5
		num = num/10; //7
		
		if(reminder1>reminder2) {
			if(reminder1>num) {
			System.out.println(reminder1);
		}else if(reminder2>num) {
			System.out.println(reminder2);
		}else {
			System.out.println(num);
		}
		}
		
		
	}

}
