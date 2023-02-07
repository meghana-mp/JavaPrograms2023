package JavaArraysPracticejavatpoint;

import java.util.Scanner;

public class AddArrayElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {1,5,7,3,10};
		
		int sum=0;
		
		for(int i=0;i<num.length;i++) {
			sum=sum+num[i];
		}
		
		System.out.println("Addition of all array elements"+sum);
		
		
		Scanner in= new Scanner(System.in);
		System.out.println("Eneter the size of the array");
		
		int size=in.nextInt();
		
		int array2[]=new int[size];
		System.out.println("Enetr the array eleemnts");
		for(int j=0;j<size;j++) {
			array2[j]=in.nextInt();
		}
		
		
		int sum2=0;
		
		for(int k=0;k<size;k++) {
			
			sum2=sum2+array2[k];
		}
		
		System.out.println("Customized array SUm is "+sum2);
	}

}
