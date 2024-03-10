import java.util.Scanner;
public class Index {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size = sc.nextInt();
		System.out.println("Enter elements of an array " );
		int a[] = new int[size];
		for(int i =0;i<size;i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Enter any key to find the index");
		int key = sc.nextInt();
		int n = a.length;
		int i;
		for(i =0;i<n;i++)
		{
			if(a[i]==key)
			{
				System.out.println(key + " Present in the index at : " + i);
			}
		}

        }
}

