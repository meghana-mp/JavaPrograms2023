package JavaArrays;

public class FindElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array= {1,2,3,4,5,6,7};
				
		int num=5;
		
		for( int i=0;i<array.length;i++) {
			
			if( array[i] == num)
				
				System.out.println("Number " +num +" is present at index "+ i);
			
			
		}
		
		
	}

}
