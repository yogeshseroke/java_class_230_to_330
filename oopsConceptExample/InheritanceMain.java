package oopsConceptExample;

public class InheritanceMain extends Inheritance2{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InheritanceMain obj = new InheritanceMain();
		
		//for student
		obj.accept();
		obj.display();
		
		//for teacher
		obj.accept1();
		obj.display1();
		
		//for subject
		Inheritance3 obj1 = new Inheritance3();
		obj1.accept2();
		obj1.display2();
	}

}
