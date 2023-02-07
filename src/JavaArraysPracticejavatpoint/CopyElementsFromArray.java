package JavaArraysPracticejavatpoint;

public class CopyElementsFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num= {8,4,6,4,3,1};
		
		
		int[] num2=new int[num.length];
		
		
		for(int i=0;i<num.length;i++) {
			
			num2[i]=num[i];
		}
		
		System.out.println("Elements from the new array ");
		
		for(int j=0;j<num2.length;j++) {
			System.out.println(num2[j]);
		}
		
		
	}

}
