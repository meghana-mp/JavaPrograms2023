package JavaArrays;

import java.util.Scanner;

public class JavaBasicConceptsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String
		String str="Good Moring";
		//String converted to char Array
		char[] Chararray=str.toCharArray();
		
		//Print Char array
		System.out.println(Chararray);
		
		//char array values stored in index
		for(int i=0;i<Chararray.length;i++) {
			System.out.println(Chararray[i]);
		}
		
Scanner in = new Scanner(System.in);

//Store input in String
System.out.println("Enter the String");
String str1=in.next();

System.out.println(str1);

//Strore input in int
System.out.println("Enter a number");
int num1=in.nextInt();
System.out.println(num1);

//Store value in a array String

String[] array1= new String[3];	
System.out.println("Enter the array elements");
for(int i=0;i<array1.length;i++) {
	array1[i]=in.next();
}

System.out.println("All array element");
for(int j=0;j<array1.length;j++) {
	
	System.out.println(array1[j]);
}
	}
	

}
