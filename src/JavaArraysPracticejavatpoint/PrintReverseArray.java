package JavaArraysPracticejavatpoint;

public class PrintReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num= {4,7,2,6,8,0};
		
		
		for (int i=0;i<num.length;i++) {
			
			System.out.print(num[i]);
		}
		
		System.out.println("Reverse");

		for(int i=num.length-1;i>=0;i--) {
			System.out.println(num[i]);
		}
	}

}
