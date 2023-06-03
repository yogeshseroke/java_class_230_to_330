package oopsConceptExample;

public class Inheritance1 {

	int studentAge;
	
	String studentName;
	
	void accept() {
		studentAge = 28;
		studentName = "Ashish";
	}
	
	void display() {
		System.out.println("student age = " + studentAge);
		System.out.println("student name = " + studentName);
	}
}
