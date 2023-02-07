package JavaArrays;

public class MergeArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array1[]= {1,4,7,3};
		int array2[]= {8,3,1,6,7,2,0};
		
		
		int array3[]=new int[array1.length+array2.length];
		
		int count=0;
		
		for(int i=0;i<array1.length;i++) {
			
			array3[i]=array1[i];
			count++;
		}
		
		for(int j=0;j<array2.length;j++) {
			array3[count++]=array2[j];
		}
		
		for(int k=0;k<array3.length;k++) {
			
			System.out.println(array3[k]);
		}
	}

}
