package assignment2;

public class MatrixAddition {

	public static void main(String[] args) {
		int rows=3,columns=3;
		int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int b[][]= {{1,2,3},{1,2,3},{1,2,3}};
		int c[][]=new int[rows][columns];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		
		System.out.println("Sum : ");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
	}

}
