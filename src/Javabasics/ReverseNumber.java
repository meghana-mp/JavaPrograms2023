package Javabasics;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int num=10;
			int r=0;
		   int sum=0;
		
		
		while(num!=0) {
			
			r=num % 10;
			
			sum = (sum*10) + r;
			
			num=num/10;
			
		}
		
		System.out.print(sum);
	}

}
