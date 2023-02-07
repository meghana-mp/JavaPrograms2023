package JavaArraysPracticejavatpoint;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array= {1,7,3,5,2,9,3};
		
		int max=array[0];
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]>max) {
				
				max=array[i];
			}
		}
		
		System.out.println("Max number in array is "+max);
	}

}
