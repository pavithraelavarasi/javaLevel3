//Suppose we had a list of n integers sorted in ascending order. How quickly could we check if a given integer is in the list?

public class BinarySearch
{
		// l = left index, r = right index, x = number to be checked
 static int findNum(int [] array, int l, int r, int x)
 {
   if(r >= l)
   {
    int mid = l + (r - l) / 2;
			
     if(array[mid] == x)
      {
	  return mid;
      }
      if(array[mid] > x)
      {
          return findNum(array, l, mid - 1, x);
      }
      else 
      {
      	    return findNum(array, mid + 1, r, x);
      }
     }
     return -1;
   }
   public static void main(String[] args)
    {
     
    int [] array = {2, 4, 3, 40, 35};
    int n = array.length;
    int x = 10;
    int result = findNum(array, 0, n - 1, x);
    if(result == -1)
     {
      System.out.println("Element not present");
      }
     else
      {
      System.out.println("Element present at index : " + findNum(array, 0, n - 1, x));
      }
    }
}	
