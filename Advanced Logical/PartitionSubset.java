/*
4.Given a set of integers, return whether the set can be partitioned into two subsets whose sums are the same.

For example, given the set {15, 5, 20, 10, 35, 25}, it would return true, since we can split the set up into {15, 5, 10, 15} and {20, 35}, which both add up to 55.

Given the set {15, 5, 20, 10, 35}, it would return false, since we can't split the set up into two subsets that add up to the same sum.
*/

public class PartitionSubset
{
 static boolean subsetSum(int [] array, int n, int sum)
  {
   if(sum == 0)
   {
    return true;
   }
   else if(n == 0 && sum != 0)
   {
    return false;
    }//check last element is great than sum
   if(array[n - 1] > sum)
    {
     return subsetSum(array, n - 1, sum);
     }
		/*
		else check if sum can be obtained by
		1) including last element 
		2) excluding last element
		*/
       else
      {
       return subsetSum(array, n - 1, sum) || subsetSum(array, n - 1, sum - array[n - 1]);
       }
     }
	
    static boolean findPartition(int [] array, int n)
    {
     int sum = 0;
     for(int i = 0; i < n; i++)
      {
       sum = sum + array[i];
       }
      if(sum % 2 != 0)
       {
	 return false;
        }
        else
	{
	  return subsetSum(array, n, sum / 2);
	 }
       }
	
    public static void main(String[] args)
    {
//     int [] array = {15, 5, 20, 10, 35, 25};
       int [] array = {-1,-1,9,9};
     int n = array.length;
     findPartition(array, n);
      if(findPartition(array, n) == true)
	{
	 System.out.println("Can be divided into two subset of equal sum");
         }
        else
         {
	  System.out.println("Can't not be divided into two subset of equal sum");
	 }
      }
}
