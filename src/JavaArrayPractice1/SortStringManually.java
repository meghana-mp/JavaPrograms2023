package JavaArrayPractice1;

import java.util.Arrays;
//compare to
public class SortStringManually {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"fly","apple","kite","ball","dog"};
		
		int size=str.length;
		
		
		for(int i=0;i<size;i++) {
			
			for(int j=i+1;j<size;j++) {
				
				if(str[i].compareTo(str[j])>0) {
					
					String temp=str[i];
					str[i]=str[j];
					str[j]=temp;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(str));
		
		
		
	}

}
