package oopsConceptExample;

public class StaticAndNonstaticExample {

	//global variable...
	
	int x;//global - non static
	static int y;//global - static
	
	//Local variable...
	
	void accept1() {
		x=10;//local-non static 
	}
	
	static void accept2() {
		y=20;//local-static
	}
	
	void display(){
		System.out.println(x+" "+y);
	}
	
	//add,sub,mul,div,reminder
	//si,factorial,fibonacci,prime,even-odd
}
