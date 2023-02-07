package Javabasics;

public class PrimeNumber {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num=1;
		boolean flag=false;

		
		if (num == 0 || num == 1)
			
			System.out.println("Not a Prime number");
		
		else {
	
		for(int i=2;i<=num/2;i++) {
			
			if((num%i)==0){
				System.out.println("Not a Prime number");

				flag=true;
				break;
			}
			
		}
		
		if(flag==false)
			System.out.println("Its a Prime number");
		}
	}

}
