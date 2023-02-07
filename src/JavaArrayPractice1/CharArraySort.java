package JavaArrayPractice1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CharArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	char[] array= {'a','b','v','q','c'};
		
		
String str="meghana";

char[] array=str.toCharArray();


System.out.println("The Character array elements");

/*
for(int i=0;i<array.length;i++) {
	
	System.out.println(array[i]);
}*/
	
	
	
	for(int x=0;x<array.length;x++) {
		for(int y=x+1;y<array.length;y++){
			if(array[x]>array[y]) {
				char temp=array[x];
				array[x]=array[y];
				array[y]=temp;
			}
			
			
		}
	}
	
	System.out.println(array);
	
	
	//char array to STring
	
	System.out.print(Arrays.toString(array));

}
}
