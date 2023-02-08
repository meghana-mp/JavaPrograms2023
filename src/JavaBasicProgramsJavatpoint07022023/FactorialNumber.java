package JavaBasicProgramsJavatpoint07022023;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int num=5;
       int fact=1;
       
       for(int i=1;i<=num;i++) {
    	   fact=fact*i;
       }
       
       System.out.println("Factorial of"+ num+"is "+fact);
	}

}
