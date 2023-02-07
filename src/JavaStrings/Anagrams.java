package JavaStrings;

import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="abcj";
		
		String str2="xyzk";
		
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()!=str2.length())
			System.out.println("Strings are not Anagram");
		else
		{
			char[] string1=str1.toCharArray();
			char[] string2=str2.toCharArray();
			
			
			Arrays.sort(string1);
			Arrays.sort(string2);
			
			if(Arrays.equals(string1, string2)==true) {
				System.out.println("Strings are Anagrams");
			}
			else
				System.out.println("Strings are not Anagrams");
				
		}
		
	}

}
