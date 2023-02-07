package JavaStrings;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="google";
		
		String reverse="";
		
		for(int i=0;i<str.length();i++) {
			
			reverse=str.charAt(i)+reverse;
		}
		
		System.out.println(reverse);
		
		if (str.equals(reverse))
			System.out.println(" String is palindrome");
		else
			System.out.println("Not palindrome");
	}

}
