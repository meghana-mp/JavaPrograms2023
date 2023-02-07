package Javabasics;

public class Factorial {
//feb 2nd 2023
	public int factorial(int num) {
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			
			fact=fact*i;
			
		}
		
		return fact;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Factorial f1=new Factorial();
		
		System.out.println(f1.factorial(6));
	}

}
