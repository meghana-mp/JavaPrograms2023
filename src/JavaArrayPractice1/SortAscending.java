package JavaArrayPractice1;

import java.util.Scanner;

public class SortAscending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		System.out.print("Enter the array length");
		Scanner in=new Scanner(System.in);
		
		int size=in.nextInt();
		int[] array= new int[size];

		System.out.println("Input array Elements");
		
		for(int x=0;x<size;x++) {
			array[x]=in.nextInt();
		}
		
		
		int temp=0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array.length;j++) {
				
				if(array[i]<array[j]) {
					
					temp=array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
			
			
		}
		
		
		
		//Print the soreted array
		
		for(int k=0;k<array.length;k++) {
			
			
			System.out.println(array[k]);
		}
		
		
	}

}
