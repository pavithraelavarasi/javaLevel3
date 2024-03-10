//2. Given an array of integers, write a function to determine whether the array could become non-decreasing by modifying at most 1 element. For example, given the array [10, 5, 7], you should return true, since we can modify the 10 into a 1 to make the array non-decreasing. Given the array [10, 5, 1], you should return false, since we can't modify any one element to get a non-decreasing array. 

import java.util.Scanner;
class Main {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = sc.nextInt();
        int a[] = new int[size];
        int count =0;
        System.out.println("Enter the elements of an array");
        for(int i =0;i<size;i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i=1;i<size;i++)
        {
            if(a[i-1] > a[i])
            {
              count++;
            }	
        }
        if(count<=1)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("False");
        }
        
    }
}
