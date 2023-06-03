package forEachLoopExample;

public class ForEachLoopExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int ar[] = {2,9,3,8,4,7};
		
//		int ar[] = new int[5];
		
//		for(int i=0; i<=ar.length-1; i++) {
//			System.out.print(ar[i]+" ");
//		}
		
		//for-each loop....
		
		for(int i : ar) {
			System.out.print(i+" ");
		}
		
	}

}
