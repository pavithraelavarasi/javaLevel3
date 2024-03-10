//6. Given a 2D matrix of characters and a target word, write a function that returns whether the word can be found in the matrix by going left-to-right, or up-to-down. 

import java.util.*;
public class TargetWord {
 public static void main (String args[])
 {
   int i,j,r,c,n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows in the matrix: ");
		r = scanner.nextInt();
		System.out.println("Enter the number of columns in the matrix: ");
		c = scanner.nextInt();
		char[][] a = new char[r][c];
		System.out.println("Enter the element in the matrix: ");
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				a[i][j]=scanner.next().charAt(0);
			}
		}
		String temp = "";
		String temp1= "";
		List<String> words = new ArrayList<String>();
		
		System.out.println("The word is: ");
			for(j=0;j<c;j++){
				temp = "";
				temp1= "";
				for(i=0;i<r;i++){
					temp = temp + a[i][j];
					temp1 = temp1 + a[j][i];
				}
				words.add(temp);
				words.add(temp1);
			}
		for(i =0;i<r;i++)
		{
			for(j = 0;j<c;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println(words.toString());
		System.out.println("Enter the word to check: ");
		scanner.nextLine();
		String x = scanner.nextLine();
		boolean isValid = false;
		for(i=0;i<words.size();i++){
			if(words.get(i).contains(x)){
				isValid = true;
				break;
			}
		}
		if(isValid){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
}
