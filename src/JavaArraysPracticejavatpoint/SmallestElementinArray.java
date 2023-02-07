package JavaArraysPracticejavatpoint;

public class SmallestElementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {8,1,3,4};
		
		int min=num[0];
		
		for(int i=0;i<num.length;i++) {
			
			if(num[i]<min) {
				min=num[i];
			}
		}
		
		System.out.println("Minimun number is  "+min);
		
		
		
	}

}
