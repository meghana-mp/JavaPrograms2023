package JavaArraysPracticejavatpoint;

public class PrintElementAtOddPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {1,5,6,3,5,7,7,9,0,3,3};
		
		
		for(int i=0;i<array.length;i++) {
			
			if(i%2==0) {
				System.out.println("Even position "+i+" has the element "+ array[i]);
			}
		}

		
		for(int j=0;j<array.length;j++) {
			
			if(j%2!=0) {
				System.out.println("Odd position "+j+" has the element "+ array[j]);
			}
		}

	}

}
