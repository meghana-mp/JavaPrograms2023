package Javabasics;

public class JavaStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Feb 2nd 2023
		String s1="Go Get a Beautiful Life";
		
		String s2=" Live Happily";
		
		//Length of String
		
		System.out.println("Length of String is  " + s1.length());
		
		//Concat two string  method 1: + operator
		
		System.out.println("Concat + operator -> " + (s1+s2));
		
		
		//Concat two string  method 2: concat method	
				System.out.println("Concat method -> " + s1.concat(s2));
				
//Convert to uppercase
				System.out.println(s1.toUpperCase());
				
				//convert to lower case
				System.out.println(s1.toLowerCase());
				
				
				//compariosion function
				// returns 0 if both strings are equal
				//returns a positive number if firstname is lengthy than last name
				//returns a negative number if Lastname is legthy than first name
				
				String firstName="Meghana";
				
				String secondname="mp";
				
				
				System.out.println(firstName.compareTo("Meghana"));
				System.out.println(firstName.compareTo(secondname));
				System.out.println(secondname.compareTo(firstName));


				//String equals function  returns boolean
				
				System.out.println(firstName.equals("Meghaana"));

	}

}
