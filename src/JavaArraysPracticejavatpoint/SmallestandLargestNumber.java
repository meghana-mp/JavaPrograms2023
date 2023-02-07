package JavaArraysPracticejavatpoint;

public class SmallestandLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] array= {4,2,8,3,1,0,5};
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]>array[j]) {
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
				
			}
		}
		
		
		for(int k=0;k<array.length;k++) {
			System.out.println(array[k]);
		}
		
		System.out.println("First Smallest Elemetn is "+array[0]);
		System.out.println("Second Smallest Elemetn is "+array[1]);

		
		System.out.println("Second Largest "+array[array.length-2]);
		System.out.println("Third Largest "+array[array.length-3]);

		System.out.println("Largest Elemetn is "+array[array.length-1]);
		

	}

}
