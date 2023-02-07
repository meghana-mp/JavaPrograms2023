package JavaArrayPractice1;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1= {"abc","def","ghi"};
		
		
		//now copy the array1 elements to arary2
		
		String[] array2= new String[array1.length];
		
		
		for(int i=0;i<array1.length;i++) {
			
			
			array2[i]=array1[i];
		}
		
		//Print the Values copied in array2
		for(int j=0;j<array2.length;j++)
		{
			System.out.println(array2[j]);
		}
	}

}
