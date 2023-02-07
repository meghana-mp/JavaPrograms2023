package JavaConcepts;

public class DefaultConstructor {

	int id;
	String name;
	void display() {
		System.out.println(id+" "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultConstructor d1=new DefaultConstructor();
		d1.display();
	}

}
