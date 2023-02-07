package Javabasics;

public class JavaOperators {
	int result;
	
	public int add(int num1, int num2) {
	
		result=num1+num2;
		
		return result;
		
	}
	
	public int sub(int num1, int num2) {
		
		result=num2-num1;
		
		return result;
		
	}
	
public int multiply(int num1, int num2) {
		
		result=num2*num1;
		
		return result;
		
	}
	

public int divide(int num1, int num2) {
	
	result=num2/num1;
	
	return result;
	
}


public int increment(int num1) {
	
	result=++num1;
	
	return result;
	
}


public int decrement(int num1) {
	
	result=--num1;
	
	return result;
	
}

public int assign(int num1) {
result=num1;
result=result*10;
	
	return result;
	
}



public void isNumEqual() {
	
	int num1=125;
	int num2=125;
	if(num1==num2)
	
System.out.println("Number is equal")	;
	
	else
		System.out.println("Number is not equal");
}




	public static void main(String args[]) {
		//feb 2nd 2023
		int num1=121;
		int num2=345;
		
		JavaOperators obj=new JavaOperators();
   
		System.out.println("Addition of numbers    "+obj.add(num1,num2));
		
		System.out.println("Subtraction of numbers    "+obj.sub(num1,num2));
		
		System.out.println("Multiplication of numbers    "+obj.multiply(num1,num2));
		
		System.out.println("Division of numbers    "+obj.divide(num1,num2));
		
		System.out.println("Increment of num1    "+obj.increment(num1));
		System.out.println("Decrement of num1    "+obj.decrement(num1));

		System.out.println("assign    "+obj.assign(num1));
obj.isNumEqual();

	}
	
	

}
