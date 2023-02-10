package javatpoint08022023;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m1[][]= {
		{1,2,3},
		{4,5,6},
		{3,4,5}
		};
		
		int transpose[][]=new int[3][3];
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				transpose[i][j]=m1[j][i];
			}
		}
		
		System.out.println(" After Transpose matrix");

		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(transpose[i][j]+" ");
			}
			System.out.println(" ");
		}
	}

}
