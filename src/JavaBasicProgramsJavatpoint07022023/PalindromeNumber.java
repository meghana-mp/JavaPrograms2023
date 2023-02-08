package JavaBasicProgramsJavatpoint07022023;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4455494;
		int temp=num;
		
		int r;
		int sum=0;
		
		while(num>0) {
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
			
		}
		
		if(temp==sum)
			System.out.println(" Number is Palidrome");
		else
			System.out.println(" Number is not palindrome");
	}

}
