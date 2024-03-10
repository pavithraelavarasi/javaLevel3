//40. Write a Java program to find the two elements from a given array of positive and negative numbers such that their sum is close to zero.   


public class PositiveNegativeZero {
 public static void main (String args[])
 {
    int i,j,n;
   Scanner sc = new Scanner (System.in);
   System.out.println("Enter the number of elements in the array: ");
   n = scanner.nextInt();
   System.out.println("Enter the array elements: ");
   int[] a = new int[n];
   for(i=0;i<n;i++)
    {
     a[i]= scanner.nextInt();
    }
    System.out.println("The two elements their sum is close to zero are: ");
     for(i=0;i<n;i++)
     {
      for(j=i+1;j<n;j++)
       {
	 if ((a[i]+a[j])==0)
	   {
	   System.out.println(a[i] + " and " + a[j]);
	    }
	 }
        }
    }
}
