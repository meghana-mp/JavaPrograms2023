package Javabasics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Percentage {
 float percent;
	
	
	public float calculatePercentage1(float marks,float total) {
		
		percent= (( marks / total) * 100);
		System.out.print(percent);
		return percent;
	}
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Percentage obj=new Percentage();
		System.out.println("Enter obtained marks ");
		
        Scanner in = new Scanner(System.in);

float m1=in.nextFloat();		
		System.out.println("Enter total marks ");

		float t1= in.nextFloat();
		
		
		float p1=obj.calculatePercentage1(m1,t1);
		System.out.print("The percentage is: " +p1);
		
		
	}


	private float calculatePercentage(float m1, float t1) {
		// TODO Auto-generated method stub
		return 0;
	}

}
