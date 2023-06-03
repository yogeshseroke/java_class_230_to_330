package oopsConceptExample;

public class Inheritance2 extends Inheritance1{

	
	int teacherAge;
	
	String teacherName;
	
	//accept age and name of teacher
	void accept1() {
		teacherAge=45;
		teacherName="ShivaSir";
	}
	
	//teacher age and name display
	void display1() {
		System.out.println("teacher age = "+ teacherAge);
		System.out.println("teacher name = "+ teacherName);
	}
	
	
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		Inheritance2 obj = new Inheritance2();
//		obj.accept();
//		obj.display();
//	}

}
