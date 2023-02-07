package JavaConcepts;

public class OverloadingByReturnType {

	//Shows error Duplicate method
	public int add(int num1,int num2) {
		return num1+num2;
	}
	public double add(int num1,int num2,int num3) {
		
		return num1+num2 + num3;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingByReturnType obj= new OverloadingByReturnType();
		
		System.out.println(obj.add(12, 25, 66));
	}

}
