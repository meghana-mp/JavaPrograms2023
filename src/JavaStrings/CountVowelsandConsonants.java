package JavaStrings;

public class CountVowelsandConsonants {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String str=str1.toLowerCase();
		int vcount=0; 
		int ccount=0;
		
	//	if(str.charAt(i));
		
		
		for(int i=0;i<str.length();i++) {
			
			if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u')) {
				System.out.println(str.charAt(i)+" is vowel");
				vcount++;
			}
			
			else {
				
				System.out.println(str.charAt(i)+" is consonant");

				ccount++;
			}
		}
		
		
		System.out.println(" Vocwels count "+vcount);
		
		System.out.println("Consonants count "+ ccount);

	}

}
