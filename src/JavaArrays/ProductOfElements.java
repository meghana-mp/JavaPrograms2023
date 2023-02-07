package JavaArrays;

public class ProductOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[]= {1,2,3,4,5,6,7,8,9,10};
		
		int product=1;
		
		for(int i=0;i<array.length;i++) {
			product=product*array[i];

		}
		
		System.out.println("The product of array elements"+product);
	}

}
