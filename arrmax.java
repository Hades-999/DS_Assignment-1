import java.util.*;
class arrmax
{
	public static void main(String args[])
	{
		int n,i,max;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter size of the array:");
		n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter any "+n+" elements:");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		max=a[0];
		for(i=0;i<n;i++)
		{
			if(a[i]>=max)
				max=a[i];
		}
		System.out.println("Largest Element="+max);
	}
}
		