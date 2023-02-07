package JavaArrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {3,2,6,4,1,9};
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		
		System.out.println("Array elements");
		for(int k=0;k<arr.length;k++) {
			
			System.out.println(arr[k]);
		}
	}

}
