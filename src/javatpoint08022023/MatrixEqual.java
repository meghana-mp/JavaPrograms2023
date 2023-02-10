package javatpoint08022023;

public class MatrixEqual {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag=true;
		int[][] m1= {
				{1,2,77},
				{4,5,6},
				{6,7,8,}};
		
		int[][] m2= {
				{1,2,3},
				{4,5,6},
				{6,7,8,}};
		
		int[][] m3=new int[3][3];
		
		//calcultae number of rows and columns in matrix 1
		int m1row=m1.length;
		int m1col=m1[0].length;
		
		
		//calcultae number of rows and columns in matrix 2
		int m2row=m2.length;
		int m2col=m2[0].length;
		
		
		if(m1row!=m2row && m1col!=m2col) {
			System.out.println(" Matrices are not equal");	
		}
		else {
			for(int i=0;i<m1row;i++) {
				for(int j=0;j<m2col;j++) {
					if(m1[i][j]!=m2[i][j]) {
						flag=false;
						break;
					}
				}
				
			}
			
			if(flag)
				System.out.println(" Matrices are equal");
			else
				System.out.println(" Matrices are not equal");	
			
		}
		


	}

}
