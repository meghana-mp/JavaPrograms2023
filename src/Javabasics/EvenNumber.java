package Javabasics;

import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Feb1st 2023

Scanner in=new Scanner(System.in);
System.out.println("Entger the number");

int num=in.nextInt();


if(( num % 2) == 0)
	System.out.println("Number is Even");
else
	
	System.out.println("Number is Odd");
	}

}
