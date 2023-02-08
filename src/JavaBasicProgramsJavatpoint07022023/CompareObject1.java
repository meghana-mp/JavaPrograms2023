package JavaBasicProgramsJavatpoint07022023;

public class CompareObject1 {

	
	CompareObject1 () {
		System.out.println("Object");
		
		
	}
	
	public static void main(String[] args) {
		CompareObject1 obj1= new CompareObject1();
		CompareObject1 obj2= new CompareObject1();
		
		Double d1=new Double(123);
		Double d2=new Double(123);

		Long y = new Long(9887544);  

		System.out.println(obj1.equals(obj2));
		System.out.println(d1.equals(y));
		
		//Using Hash code
		
		
		


	}
}
