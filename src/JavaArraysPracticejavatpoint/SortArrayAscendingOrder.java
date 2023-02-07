package JavaArraysPracticejavatpoint;

import java.util.Scanner;

public class SortArrayAscendingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num= {5,2,9,4,1,0};
		
		
		for(int i=0;i<num.length;i++) {
			for (int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
				int temp=num[i];
				num[i]=num[j];
				num[j]=temp;
				}
			}
		}
		
		
		System.out.println("Array Elements");
		
		for(int k=0;k<num.length;k++) {
			System.out.println(num[k]);
		}
		
		
		
		System.out.println("Enetr the array size");
		
		Scanner in= new Scanner(System.in);
		
		int size=in.nextInt();
		
		int[] num2=new int[size];
		System.out.println("Enter array elements");
		for(int x=0;x<size;x++) {
			num2[x]=in.nextInt();
			
		}
		
		
		for(int i=0;i<num2.length;i++) {
			for (int j=i+1;j<num2.length;j++) {
				if(num2[i]>num2[j]) {
				int temp=num2[i];
				num2[i]=num2[j];
				num2[j]=temp;
				}
			}
		}
		
System.out.println("Array Elements");
		
		for(int k=0;k<num2.length;k++) {
			System.out.println(num2[k]);
		}
		
	}

}
