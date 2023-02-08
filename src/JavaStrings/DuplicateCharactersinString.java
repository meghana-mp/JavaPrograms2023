package JavaStrings;

public class DuplicateCharactersinString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Good Morning";
		
		char arr1[]=str.toCharArray();
		int count=0;
		
		for(int i=0;i<arr1.length;i++) {
			count=1;
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]&& arr1[i]!=' ') {
					count++;
					arr1[j]=0;
				}

			}
			if(count>1&& arr1[i]!=0) {
				System.out.println(arr1[i]+" The count is "+count);
			}
			
		}
	//	System.out.println(" the count is " + count);

	}

}
