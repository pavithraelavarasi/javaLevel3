class SecondLargeNew {

// * Second Largest element in an array *
    public static void main(String args[])
    {
        int a[] = {1,2,3,4,5,6,7};
        int n = a.length;
        int max = a[0];
        for(int i =0;i<n;i++)
        {
            max = a[i]>max ? a[i]:max;
        }
        System.out.println("Maximum Element  - "+ max);
        int min = a[0];
     //   int max1 = a[0];
        for(int i =0;i<n;i++)
        {
            min = a[i]<min ?a[i]:min;
        }
        System.out.println("Minumum Element - "+ min);
        int max1 = min;
        for(int i =0;i<n;i++)
        {
            if(a[i]>=max1 && a[i]<max)
            {
                max1 = a[i];
            }
        }
        System.out.println("Second Maximum - " +max1);
        
        
    }
}
// * Second Smallest element in an array *

public static void main(String args[])
{
	int a[] = {1,2,3,4,5,6,7};
	int n =a.length;
        int min = a[0];
	int max = a[0];
	for(int i =0;i<n;i++)
	{
		min = a[i]<min ?a[i]:min;
	}
	System.out.println("Minimum element is - " +min);
	for(int i =0;i<n;i++)
        {
            max = a[i]>max ? a[i]:max;
        }
        System.out.println("Maximum Element  - "+ max);
	int min2 = max;
	for(int i =0;i<n;i++)
	{
		if(a[i]<=min2 && a[i]>min)
		{
			min2 = a[i];
		}
	}
	System.out.println("Second minimum - " + min2);
}
}

