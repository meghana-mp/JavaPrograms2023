package JavaStrings;

public class CountPunctuation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str="Hey! How do you do ? Hope you are well; ";
		
		int count=0;
		
		//char[] str=string.toCharArray();
		
		
		for(int i=0;i<str.length();i++) {
			
			if((str.charAt(i)=='!')||(str.charAt(i)=='?')||(str.charAt(i)==';')) {
				count++;
			}
			
			
		}
		
		System.out.println(" Total punctuation marks are -> "+count);

	}

}
