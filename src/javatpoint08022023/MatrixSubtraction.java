package javatpoint08022023;

public class MatrixSubtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int m1[][]={{1,3,4},{4,3,1},{5,6,7}};
		int m2[][]={{10,30,4},{6,8,7},{9,7,9}};
		int m3[][]=new int[3][3];
		
		System.out.println("Subtraction of Matrix ");
for(int i=0;i<3;i++) {
	for(int j=0;j<3;j++) {
		m3[i][j]=m2[i][j]-m1[i][j];
		System.out.print(m3[i][j]+" ");
	}
	System.out.println("");
}
	

	}

}
