package JavaArrays;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=654234;
		
		int sum=0,r=0;
		
		
	while(num!=0) {
		r=num%10;
		sum=sum*10+r;
		num=num/10;
	}
	
	System.out.println(sum);
	}

}
