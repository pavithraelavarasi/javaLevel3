//39. Write a Java program to print all the LEADERS in the array.   

//Note: An element is leader if it is greater than all the elements to its right side.

public class Leaders {
  public static void main(String[] args)
  {
    int [] array = {10, 9, 14, 23, 15, 0, 9};
      for(int i =0; i < array.length; i++)
	{
	 int j;
	 for(j = i +1; j < array.length; j++)
	   {
	    if(array[i] <= array[j])
	     {
	      break;
	     }
	    }
	     if(j == array.length)
	      {	
	       System.out.print(array[i] + " ");
	      }
	    }
     }
}



-------- 

// another method 

//39. Write a Java program to print all the LEADERS in the array.   

//Note: An element is leader if it is greater than all the elements to its right side.

public class Main {
  public static void main(String[] args)
  {
    int [] a = {10, 9, 14, 23, 15, 0, 9};
    
    for(int i =0;i<a.length;i++)
    {
            boolean is_leader = true;

        for(int j = i+1;j<a.length;j++)
        {
            if(a[j] >= a[i])
            {
                is_leader = false;
                break;
            }
        }
        if(is_leader == true)
        {
            System.out.println(a[i]);
        }

   }
  }
}
