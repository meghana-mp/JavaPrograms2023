package JavaArraysPracticejavatpoint;

public class SortArrayDescending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num= {1,3,2,8,9,0};
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]<num[j]) {
					int temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		
		System.out.print("Descending order");

		for(int k=0;k<num.length;k++) {
			System.out.print(num[k]);

		}

	}

}
