package javatpoint08022023;

public class MultiplicationMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int m1[][]= {{2,3,4},{4,5,6},{6,7,8}};
		int m2[][]= {{2,3,4},{4,5,6},{6,7,8}};
		int m3[][]= new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				m3[i][j]=m1[i][j]*m2[i][j];
				System.out.print(m3[i][j]+" ");
			}
			System.out.println("");
		}

	}

}
