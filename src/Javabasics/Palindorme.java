package Javabasics;

public class Palindorme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=44;//find if this is palidrome
		
		int r=0, sum=0;// to store remainder
		int temp=num;
		
		while(num>0) {
			
			
			r=num%10;
			
			sum= (sum*10)+r;
			
			num=num/10;
		}
		
		
		if(temp==sum) {
			
			System.out.print("Number is palidrome");
		}
		else
			System.out.print("Number is not palidrome");

	}
	

}
