/*	
10. A left rotation operation on an array of size shifts each of the array's elements unit to the left. For example, if 2 left rotations are performed on [1,2,3,4,5 ]array , then the array would become [3,4,5,1,2].
*/
import java.util.Scanner;

public class LeftRotation
{
	public static void main(String[] args)
	{
		int [] array = {1, 2, 3, 4, 5};
		int n = array.length;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Number for left rotation");
		int d = scan.nextInt();
		
		for(int j = 0; j < d; j++)
		{
    		int first = array[0];
    		
    		for(int i = 0; i < n - 1; i++)
    		{
    			array[i] = array[i + 1];
    		}
    	
    		array[n - 1] = first;
		}
		System.out.println("Left Rotated array : ");
		
		for(int i = 0; i < n; i++)
		{
		  System.out.print(array[i] + " ");
		}
	}
}
