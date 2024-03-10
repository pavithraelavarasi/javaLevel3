class Prac {
	public static void main(String args[])
	{
		int eRow=3,eCol = 3;
		int sRow=0,sCol = 0;
		int a[][] = {{1,2,3},
			{4,5,6},
			{7,8,9}};
		while(sRow < eRow && sCol < eCol)
		{
			for(int i =sCol;i<eCol;i++)
			{
				System.out.println(a[sRow][i]);
			}
			sRow++;
			for(int i =sRow;i<eRow;i++)
			{
				System.out.println(a[i][eCol-1]);
			}
			eCol--;
			if(sRow < eRow)
			{
				for(int i=eCol-1;i>=sCol;i--)
				{
					System.out.println(a[eRow-1][i]);
				}
				eRow--;
			}
			if(sCol < eCol)
			{
				for(int i =eRow-1;i>=sRow;i--)
				{
					System.out.println(a[i][sCol]);
				}
				sCol++;
			}
		}
	}
}

