package Javabasics;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="goog";
		
		String reverse="";
		
		
		
		for(int i=0;i<str.length();i++) {
			reverse=str.charAt(i)+reverse;
			
		}
		
		System.out.println(reverse);
		
		if(str.equals(reverse))
			System.out.println("Palidrome");
		
		else
			System.out.println("Not palindrome");
	}

}
