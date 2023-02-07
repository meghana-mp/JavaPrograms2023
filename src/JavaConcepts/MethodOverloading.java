package JavaConcepts;

public class MethodOverloading {
	
	
	//Method Overloading:  If a class has multiple methods with the same name but different parameters
	//2 ways to overload: 1. By changing the number of arguments  2. By changing the data type of the arguments
	public int add(int num1, int num2) {
		
		return num1+num2;
	}
	
	
	public int add(int num1, int num2, int num3) {
		return num1+num2+num3;
	}

	
	public double add(double num1, double num2, double num3) {
		return num1+num2+num3;
	}

	
	public static void main(String args[]) {
		
		MethodOverloading obj=new MethodOverloading();
		
		System.out.println(obj.add(1, 2));
		System.out.println(obj.add(1, 2,3));
		System.out.println(obj.add(1.1, 2.2,3.3));


		
	}
}
