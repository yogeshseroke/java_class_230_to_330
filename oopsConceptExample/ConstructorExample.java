package oopsConceptExample;

public class ConstructorExample {

	//constructor... => object making, 
	//				 => every java class have default constructor.
	//               => constructor name ans class name must be same..
	
	//Type of constructor :- (1) default (2) parameterized (3) copy constructor
	
	//(1) default constructor...
	
	ConstructorExample(){
		System.out.println("This is default constructor...");
	}
	
	//(2) parameterized constructor...
	
	ConstructorExample(String fname,String lname){
	
//		System.out.println(fname +" "+ lname);
		this.s1=fname;
		this.s2=lname;
		
	}
	
	String s1;
	String s2;
	//(3) copy constructor...
	
	ConstructorExample(ConstructorExample a1,ConstructorExample a2 ){

		this.s1=a1.s1;
		this.s2=a2.s2;
		//System.out.println(a1.s1+a2.s2);


	}
	
	void display() {
		System.out.println(s1+" "+s2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample obj = new ConstructorExample();
		ConstructorExample obj1 = new ConstructorExample("ABC","XYZ");
		ConstructorExample obj2 = new ConstructorExample(obj1,obj1);
		obj2.display();

	}

}
