// matrix rows becomes column

class ReverseMatrix {
	public static void main(String args[])
	{
		int a[][] = {{1,2,3,4},
			     {5,6,7,8},
			     {9,10,11,12},
			     {13,14,15,16}};
		System.out.println("The Matrix is : ");
		printMatrix(a);
		//reverse(a);
		System.out.println("The reversed Matrix(Rows into colums) is : ");
		int rev[][] = reverse(a);
		printMatrix(rev);
		System.out.println("The mirror matrix is :");
		mirrorMatrix(a);
		printMatrix(a);
	}
	static void printMatrix(int a[][])
	{
		for(int i = 0;i<a.length;i++)
		{
			for(int j =0;j<a.length;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
	static int[][] reverse(int a[][])
	{
		int rev[][] = new int[a.length][a.length];
		for(int i =0;i<a.length;i++)
		{
			for(int j =0;j<a.length;j++)
			{
				rev[j][i] = a[i][j];
			}
		}
		return rev;
	}
	static void mirrorMatrix(int a[][])
	{
		for(int i =0;i<a.length;i++)
		{
			int left =0;
			int right = a[0].length-1;
			while(left < right)
			{
				int temp = a[i][left];
				a[i][left] = a[i][right];
				a[i][right] = temp;
				left++;
				right--;
			}
		}
	}

}

