package JavaBasicProgramsJavatpoint07022023;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fibonacci Series : 0,1,1,2,3,5,8,13,21......
		//First number: 0 second number:1
		
		
		int num1=0;
		int num2=1;
		
		
		System.out.println(" Enter the number of Fibonacci numbers to Print");
		int count=10;
		System.out.println("Fibonacci Series numbers are ");
		
		System.out.println(num1 +"\n"+ num2+"");
		for(int i=2;i<count;i++) {
			int num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
		}
	}

}
