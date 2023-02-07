package JavaConcepts;

public class OverloadMain {

	//Yes, by method overloading. You can have any number of main methods in a class by method overloading. But JVM calls main() method which receives string array as arguments only. Let's see the simple example:


	public static void main(String args[]) {
		// TODO Auto-generated method stub
		System.out.println("Main with String arg[]s");
	}
	public static void main(String args) {
		// TODO Auto-generated method stub
		System.out.println("Main with String ");
	}
	public static void main() {
		// TODO Auto-generated method stub
		System.out.println("Main");
	}

}
