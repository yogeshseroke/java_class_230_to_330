package oopsConceptExample;

public class AbstractionExampleInterfaceChild implements AbstractionExampleInterface{

	@Override
	public void multi() {
	
		System.out.println("abstract method..");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractionExampleInterfaceChild obj = new AbstractionExampleInterfaceChild();
		obj.add();
		
		AbstractionExampleInterface.sub();
		
		obj.multi();
	}

	

}
