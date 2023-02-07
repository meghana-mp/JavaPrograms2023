package Javabasics;

import java.util.Scanner;

public class Fibonacci {
//feb 2nd 2023
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println("Enter the number of fibonacci numbers to display");
	//	int result=0;

	//	Scanner in= new Scanner(System.in);
	//	int num=in.nextInt();
		
	   int	num1=0;
	   int num2=1;
	   System.out.println(num1 + "\n" + num2 );
	//	int num2=1;
		for (int i=0;i<10;i++) {
			
			int num3=num1+num2;
			
			System.out.println(num3);
			
			num1=num2;
			num2=num3;
		}
	}

}
