package Javabasics;

public class SwapNumbers {
	
	public void swap(int num1, int num2) {
		
		
		int swap=num2;
		
		num2=num1;
		
		System.out.println("After swap"+swap+" "+num2);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			SwapNumbers obj= new SwapNumbers();
			
			obj.swap(2, 5);
	}

}
