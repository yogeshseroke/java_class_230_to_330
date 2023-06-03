package oopsConceptExample;

public class MultipleInheritanceExample implements InterfaceA,InterfaceB{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MultipleInheritanceExample obj = new MultipleInheritanceExample();
		obj.logic();
	}

	@Override
	public void logic() {
		// TODO Auto-generated method stub
		System.out.println("addition");
	}

}
