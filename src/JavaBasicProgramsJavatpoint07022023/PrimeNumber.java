package JavaBasicProgramsJavatpoint07022023;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Prime Number: Is a number that is greater than 1 and divided by 1 and itself
		//0 and 1 are not prime numbers
		System.out.println("Enter the number to check if it ia a prime number ");
		Scanner in = new Scanner(System.in);
		
		int num=in.nextInt();
		int m=num/2;
		int flag=0;
		int count=0;
		
		if(num<=1) {
			System.out.println("Number is not prime");
		}
		
			
		for(int i=2;i<=num/2;i++) {
				if(num%i==0) {
					count++;
				}
			}
		
		
			if(count>1)
			{
				System.out.println( num+ " Number is not prime");
			}
			else {
				System.out.println(num+ " The number is prime");
			}
		}
	}


