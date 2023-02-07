package JavaArrays;

public class RemoveRepeatCharInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abcabcabc";
		char[] uniquechars=str.toCharArray();
		//System.out.println(str);
		int count=0;
		
		System.out.println("Duplicate chars");
		for(int i=0;i<uniquechars.length;i++) {
			for(int j=1;j<uniquechars.length;j++) {
				if(uniquechars[i]== uniquechars[j] && uniquechars[i]!=' ') {
					count++;
					uniquechars[j]='0';
				}
			}
			
			if(count>1 && uniquechars[i]!='0') {
				System.out.println(uniquechars[i]);
			}
		}
		
	
	}

}
