package Javabasics;

public class JavaDatatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Feb1st 2023
		
		
		//Primitive types
		
		//Size is 1 byte and Stores whole numbers from -128 to 127
		//other numbers shows Type mismatch: cannot convert from int to byte
		byte num=-128;
		System.out.println(num);
		
		//Size is 2 bytes. Stores whole numbers from -32,768 to 32,767
		//other number shows Type mismatch: cannot convert from int to short
		short s1=02345;
		
		
		//size is 4 bytes. Stores whole numbers from -2,147,483,648 to 2,147,483,647
		//Error shown is: The literal 21474836471 of type int is out of range 
		int i=2147483647;
		
		
		
		//size is 8 bytes. Stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		long l1=76767;
		
		//Stores fractional numbers. Sufficient for storing 15 decimal digits
		double f1=70.465;
		
		//Stores true or false values
		boolean b1=false;
		boolean b2=true;

		
		//Stores a single character/letter or ASCII values
		char c1='c';
		
		
	}

}
