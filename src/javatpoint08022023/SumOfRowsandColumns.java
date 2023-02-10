package javatpoint08022023;

public class SumOfRowsandColumns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] m1= {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		
		int row=m1.length;
		int col=m1[0].length;
		
		int rowsum;
		int colsum;
		
		for(int i=0;i<row;i++) {
			rowsum=0;
			for(int j=0;j<col;j++) {
				rowsum=rowsum+m1[i][j];
			}
			System.out.println(i+1 + " Row sum =  "+ rowsum);
		}
		
		for(int i=0;i<col;i++) {
			colsum=0;
			for(int j=0;j<row;j++) {
				colsum=colsum+m1[j][i];
			}
			System.out.println(i+1 + " Col sum =  "+ colsum);
		}
		
		
				
		
	}

}
