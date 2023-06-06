package class05_06pm_oops;

public class AbstractionClassExampleMain extends AbstractionClassExample{

	void managerDetails() {
		
		String managerName = "manik";
		String managerId = "101";
		String managerSalary = "80000";
	
		System.out.println(managerId+" "+managerName+" "+managerSalary);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractionClassExampleMain obj = new AbstractionClassExampleMain();
		System.out.println(obj.bankName);
		obj.bankInfo();
		
		obj.managerDetails();

		
	}

}
