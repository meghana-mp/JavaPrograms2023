package JavaArrays;

public class ShowEvennumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,6,3,4,9};
		
		System.out.println("Even numbers in Array are: ");
	for(int i=0;i<array.length;i++) {	
		
		if (array[i]%2==0) {
			
			System.out.println(array[i]+" Even number at index"+ i);
		}
		
		
	}
	
	
	System.out.println("Odd numbers in Array are: ");

	
for(int i=0;i<array.length;i++) {	
		
		if (array[i]%2!=0) {
			
			System.out.println(array[i]+" Odd number at index"+ i);
		}
		
		
	}
	}
}
