package JavaStrings;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Meghana m p";
		
		String reverse=" ";
		
		for(int i=0;i<str.length();i++) {
			
			reverse=str.charAt(i)+reverse;
		}
		
		System.out.println("Reverse\n"+ reverse);

	}

}
