package JavaConcepts;


	//child class
	public class Bike extends Vehicle{
		
		void run() {
			super.run();//Super refers to the super class(parent class ) objects
			
		System.out.println("Class Bike method");
		}
		
		
		public static void main(String args[]) {
			
			
			Bike obj = new Bike();
			
			obj.run();
			
				}
	}