package javatpoint08022023;

import java.util.Scanner;

public class MatrixAddition{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=null;
		int a,b;

		try {
		in=new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int row=in.nextInt();
		System.out.println("Enter the number of coulumns ");
		int col=in.nextInt();
		
		
		int[][] m1=new int[row][col];
		int[][] m2=new int[row][col];
		int[][] m3=new int[row][col];

		
		System.out.println("Enter the matrix1 elements");
	
		
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				m1[i][j]=in.nextInt();
		

		
		System.out.println(" The matrix1 ");
		
		
		
		for(int x=0;x<row;x++) {
			for(int y=0;y<col;y++)
				System.out.print(m1[x][y]+ " ");
				System.out.println("");
		
		}
			
		System.out.println("Enter the matrix 2 elements");
		
		
		for(int i=0;i<row;i++)
			for(int j=0;j<col;j++)
				m2[i][j]=in.nextInt();
		

		
		System.out.println(" The matrix2 ");
		
		
		
		for(int x=0;x<row;x++) {
			for(int y=0;y<col;y++)
				System.out.print(m2[x][y]+ " ");
				System.out.println("");
		
		}
			

		System.out.println("Addition of Matrix is ");
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				m3[i][j]=m1[i][j]+m2[i][j];
				System.out.print(m3[i][j]+" ");
			}
			System.out.println(" ");
			
		}
		
		
			
		
		}
		catch(Exception e) {
			
		}
		finally{
			in.close();
		}
		
	}
}

		