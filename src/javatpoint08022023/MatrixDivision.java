package javatpoint08022023;

public class MatrixDivision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] m1= {{8,25,35},{99,40,12},{9,100,66}};
		int[][] m2= {{2,5,7},{11,8,3},{9,10,6}};
		int[][] m3= new int[3][3];
		
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m3[i][j]=m1[i][j]/m2[i][j];
				System.out.print(m3[i][j]+" ");
			}
			System.out.println("");
		}
			

	}

}
