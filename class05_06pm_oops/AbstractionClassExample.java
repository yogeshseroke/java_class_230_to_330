package class05_06pm_oops;

public abstract class AbstractionClassExample {

	String bankName = "SBI";
	
	//other methods
	 void bankInfo() {
		String branchName = "Bhawarkua";
		String branchManager = "Manik";
		
		System.out.println(branchName+" "+branchManager);
	}
	
	//abstract method
	abstract void managerDetails();
	
	public static void main(String args[]) {
		System.out.println("main method in abstract class....");
		
	//	AbstractionClassExample.bankInfo();
	}
}
