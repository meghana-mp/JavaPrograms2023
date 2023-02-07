package JavaArrayPractice1;

import java.util.Arrays;

public class Sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] num= {5,8,6,2,4};
		
		
		int size=num.length;
		
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(num[i]<num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
				
			}
		}
		
		System.out.println(Arrays.toString(num));
		
	}

}
