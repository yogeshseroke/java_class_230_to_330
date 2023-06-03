package oopsConceptExample;

public class Inheritance3 extends Inheritance1{

	
	int numberOfSubject;
	
	String subjectName;
	
	void accept2() {
		numberOfSubject=5;
		subjectName="P C M H E";
	}
	
	void display2() {
		System.out.println("number of subject = "+ numberOfSubject);
		System.out.println("name of subjects = "+ subjectName);
	}
	
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Inheritance3 obj = new Inheritance3();
//		obj.accept();
//		obj.display();
//		
//		obj.accept1();
//		obj.display1();
//	}

}
