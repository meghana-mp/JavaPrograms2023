package JavaConcepts;

public class ParameterizedConstructor {

	String name;
	int id;
	
	public ParameterizedConstructor(int i, String n) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.name=n;
		
		
	}
	
	void display() {
		
		System.out.println(id+" "+name);
	}

	public static void main(String args[]) {
		
		ParameterizedConstructor obj=new ParameterizedConstructor(11,"Meghana");
		ParameterizedConstructor obj1=new ParameterizedConstructor(111,"K1");

		obj.display();
		obj1.display();
		
	}
}
