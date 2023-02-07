package Javabasics;

public class SwapNumbers2 {
//without 3rd variable
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=2;
		int y=3;
		
		System.out.println("Before swap"+x+" "+y);

		
		x=x+y;
		y=x-y;
		x=x-y;
		
		System.out.println("AFter swap"+x+" "+y);

	}

}
