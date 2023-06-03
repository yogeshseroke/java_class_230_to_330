package oopsConceptExample;

public class AbstractionExample1Child extends AbstractionExample1{


	@Override
	void sub() {
		
		System.out.println("This is for subtraction");
	}

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractionExample1Child obj = new AbstractionExample1Child();
		obj.add();//parent method
		obj.sub();//child method
		
	}


}
