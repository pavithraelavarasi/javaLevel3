//25. Write a Java program to find common elements from three sorted (in non-decreasing order) arrays. 

public class CommonThreeArray {
 public static void main (String args[])
 {
    int arr1[] = {1,3,4,10,20,30};
    int arr2[] = {4,9,10,18,20,37};
    int arr3[] = {5,10,15,20,25,20};
  //public static void  commonElements(int arr1[], int arr2[], int arr3[]) {
   for(int i = 0; i < arr1.length; i++)
    {
     for(int j = 0; j < arr2.length; j++) 
      {
       for(int k = 0; k < arr3.length; k++) 
      {
        if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) 	
         {
          System.out.println(arr1[i]);
         }
       }
     }
    }
 }
}
