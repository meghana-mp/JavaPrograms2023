package JavaBasicProgramsJavatpoint07022023;

public class CreateObjectClone implements Cloneable {

	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	String str="New Object created";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CreateObjectClone obj1=new CreateObjectClone();
		
		try {
			CreateObjectClone obj2=(CreateObjectClone)obj1.clone();
			System.out.println(obj2.str);
		}
		catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
	}

}
