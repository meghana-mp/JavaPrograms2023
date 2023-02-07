package JavaArrays;

public class SimpleArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] array= {1,2,3,4,5,6};
		double sum=0;
		
		for(int i=0;i<array.length;i++) {
			
			sum=sum+array[i];
		}
		
		System.out.println("Addition of array elements is "+sum);
		
		double avg=(sum/array.length);
		
		
		
		System.out.println(" Avearge is "+avg);
	}

}
