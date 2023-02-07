package JavaArraysPracticejavatpoint;

public class PrintOddEvenNumbersOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {7,5,9,4,3,6};
		
		System.out.println("Even numbers");
		for(int i=0;i<num.length;i++) {
			
			if(num[i]%2==0) 
				System.out.println(""+num[i]);	
		}
		
		System.out.println("Odd numbers");
		for(int i=0;i<num.length;i++) {
			
			if(num[i]%2!=0) 
				System.out.println(""+num[i]);	
		}
	}

}
