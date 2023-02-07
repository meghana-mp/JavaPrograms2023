package JavaConcepts;

public class OverloadingTypePromotion {

	public void add(int a, long b) {
		System.out.println("long");
		
	}
	
	public void add(int a, int b, int c) {
		System.out.println("int");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingTypePromotion obj= new OverloadingTypePromotion();
		
		obj.add(20,40);
		obj.add(20, 50,60);
	}

}
