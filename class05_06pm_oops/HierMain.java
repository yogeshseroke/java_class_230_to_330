package class05_06pm_oops;

public class HierMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HierC obj = new HierC();
		obj.display1();//p
		obj.display3();//c
		//==============================
		HierB obj1 = new HierB();
		obj1.display1();//p
		obj1.display2();//c
		//==============================
		HierB_b1 o1 = new HierB_b1();
		o1.display1();//p
		o1.display2();//c
		o1.display2_1();//sc
		//==============================
		HierB_b2 o2 = new HierB_b2();
		o2.display1();//super class
		o2.display2();//child
		o2.display2_2();//subchild
		//=============================
		HierC_c o3 = new HierC_c();
		o3.display1();
		o3.display3();
		o3.display3_1();
		
		//static wala krna hai....
	}

}
