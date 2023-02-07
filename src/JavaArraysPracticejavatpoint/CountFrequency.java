package JavaArraysPracticejavatpoint;

public class CountFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num[]= {1,8,3,2,9,1,1,9,3,3};
		int fr[]=new int[num.length];
		int visited=-1;
		
		for(int i=0;i<num.length;i++) {
			int count=1;
			for(int j=i+1;j<num.length;j++) {
				
				if(num[i]==num[j]) {
					count++;
					fr[j]=visited;
				}
				
			}

			if(fr[i]!=visited) {
				fr[i]=count;
			}
			
			
	        
		}
		
		for(int i1 = 0; i1 < fr.length; i1++){  
            if(fr[i1] != visited)  
                System.out.println("    " + num[i1] + "    |    " + fr[i1]);  
        }  


	}

}
