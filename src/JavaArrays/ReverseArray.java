package JavaArrays;

public class ReverseArray {

	public static void main(String args[]) {
		
		
		int originalarray[]= {1,2,5,3,4};
		
		int size=originalarray.length;
		int reversearray[]=new int[5];
		
		
		int i=0;
		int j=size-1;
		
		while(i<size) {
			
			
			reversearray[i]=originalarray[j];
			i++;
			j--;
		}
		
		
		System.out.println("Reversed array");
		
		for(int k=0;k<size;k++) {
			
			System.out.println(reversearray[k]);
		}
		
	}
}
