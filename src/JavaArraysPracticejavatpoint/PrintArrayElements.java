package JavaArraysPracticejavatpoint;

public class PrintArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String[] Animal= {"Dog","Cat","Zebra","Elepahnt"};
		
		System.out.println("Size of String array"+Animal.length);
			System.out.println("String array Elements");
		//System.out.println(Animal.toString());
			for(int i=0;i<Animal.length;i++) {
				System.out.println(Animal[i]);
			}
		
			
			int[] num= {5,6,9,4,7};
			
			System.out.println("Number array Elements");
			System.out.println("Size of number array"+num.length);

		for(int j=0;j<num.length;j++) {
			
				System.out.println(num[j]);
			}
 //System.out.println(num);
			
			char[] chararray= {'a','f','l','q','r'};
			System.out.println("Number array Elements");
			System.out.println("Size of char array"+chararray.length);
			for(int k=0;k<chararray.length;k++) {
				
				System.out.println(chararray[k]);
			}
			
		//	System.out.println(chararray);
			
			
	}

}
