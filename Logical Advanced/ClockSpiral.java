//5.Given a N by M matrix of numbers, print out the matrix in a clockwise spiral.

import java.util.Scanner;
public class ClockSpiral {
	public static void main(String[] args)
	{
		int i,j;
		int sRow =0;
		int sCol =0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows ");
		int eRow = sc.nextInt();
		System.out.println("Enter the number of columns");
		int eCol = sc.nextInt();
		int a[][] = new int[eRow][eCol];
		System.out.println("Enter the elements of a matrix");
		for(i=0;i<eRow;i++)
		{
			for(j =0;j<eCol;j++)
			{
				a[i][j]= sc.nextInt();
			}
	        }
		System.out.println("The matrix is ");
		for(i=0;i<eRow;i++)
		{
			for(j=0;j<eCol;j++)
			{
				System.out.print(a[i][j] +" ");
			}
			System.out.println();
		}
               System.out.println("After Clock wise spiral the matrix is ");
		while(sRow < eRow && sCol < eCol)
		{
			for(i = sCol; i < eCol; i++)
			{
				System.out.println("First :"+a[sRow][i]);
			}
			sRow++;
			for(i = sRow; i < eRow; i++)
			{
				System.out.println("a[ecol-1):"+a[i] + " and :"+ a[eCol-1]);
				System.out.println("Second :"+a[i][eCol - 1]);
			}
			eCol--;
			if(sRow < eRow)
			{
				for(i = eCol - 1; i >= sCol ;i--)
				{
					System.out.println("a[erow -1] : " +a[eRow -1] + " and : "+ a[i]);
					System.out.println("Third :"+a[eRow - 1][i]);
				}
				eRow--;
			}
			if(sCol < eCol)
			{
				for(i = eRow- 1; i >= sRow ;i--)
				{
					System.out.println("Fourth:"+a[i][sCol]);
				}
				sCol++;
			}
		}
	}
}
