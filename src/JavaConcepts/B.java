package JavaConcepts;

public class B extends A {
	
	
		 public void method1()
		 
		{
			 System.out.println("test child class"); 
				super.method1();

			 
		}

		 public static void main(String args[]) {

		B obj=new B();
		obj.method1();
		}


}
