 import java.util.Scanner;
class Interval{
	int start, end;
	Interval(int start, int end){
		this.start = start;
		this.end = end;
	}
}

public class OverLapping{
	public static void main(String[] args){
		int i,j,n,start,end;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of input list: ");
		n = scanner.nextInt();
		Interval[] a = new Interval[n];
		System.out.println("Enter the input list: ");
		for(i=0;i<n;i++){
			System.out.print("Start: ");
			start = scanner.nextInt();
			System.out.print("End: ");
			end = scanner.nextInt();
			a[i]=new Interval(start,end);
		}
		System.out.println("The input list: ");
		for(i=0;i<n;i++){
			System.out.print("["+ a[i].start + "," + a[i].end + "]" + " ");
		}
		Interval temp = null;
		for(i=0;i<n;i++){
			for(j=i+1;j<n;j++){
				if(a[i].start>a[j].start){
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int x= 0;
		for(i=1;i<n;i++)
		{
			if(a[x].end >= a[i].start)
			{
				a[x].end = (a[x].end)>(a[i].end)?(a[x].end):(a[i].end);
			}
		   else if (a[x].end >=a[i].end)
			{
			    a[i].end = (a[i].end)<(a[i+1].start) ?(a[i+1].start):(a[i].end);
			}
		   else 
		   {
				x++;
				a[x]=a[i];
		   }
		}
		System.out.println(" ");
		System.out.print("The Overlapped Intervals are: ");
		for (i=0;i<=x;i++)
		{
			System.out.print("[" + a[i].start + ","
										+ a[i].end + "]");
		}
	}
	}
