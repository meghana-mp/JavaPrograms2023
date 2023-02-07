package JavaArrays;

public class ExtractIntegersfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Sap1ent";
		
		str=str.replaceAll("[^0-9]", "");
		
		System.out.println(str);
		
		String alphabets="sjdhfjdh878779";
		alphabets=alphabets.replaceAll("^[0-9]^[a-z]", "");
		System.out.println(alphabets);
	}

}
