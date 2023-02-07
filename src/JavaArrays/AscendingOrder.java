package JavaArrays;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ENter the size of the array ");
		
		Scanner in= new Scanner(System.in);
		
		int size=in.nextInt();
		
		int array[]= new int[size];
		
		System.out.println("Enetr the array elements ");
		for(int i=0;i<size;i++) {
	
			array[i]=in.nextInt();
			
		}
		
		System.out.println("Array Elements");
		
		for(int j=0;j<size;j++)
		{
			System.out.println(array[j]);
		}
		
		
		
		//Sorting the array
		
		int temp;
		for (int x=0;x<size;x++) {
			
			for (int y=0;y<size;y++) {
			if(array[x]>array[y]) {
				
				temp=array[x];
				array[x]=array[y];
				array[y]=temp;
			}
			}
			
			
			System.out.println("Array after sorting");
			
			for(int l=0;l<size;l++) {
				
				System.out.println(array[l]);
			}
		}
	}

}
