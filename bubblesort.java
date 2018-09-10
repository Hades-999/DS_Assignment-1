import java.util.*;
class bubblesort
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		bubblesort b=new bubblesort();
		int n,i;
		System.out.print("Enter the size of the array:");
		n=sc.nextInt();
		int s[]=new int[n];
		System.out.println("Enter any "+n+" characters:");
		for(i=0;i<n;i++)
			s[i]=sc.nextInt();
		System.out.print("Unsorted array:");
		for(i=0;i<n;i++)
			System.out.print(s[i]+" ");
		System.out.println();
		b.sort(s);
		System.out.print("Sorted array:");
		for(i=0;i<s.length;i++)
			System.out.print(s[i]+" ");
	}
	public void sort(int s[])
	{
		int i,j,x;
		for(i=0;i<s.length;i++)
		{
			for(j=0;j<s.length-i-1;j++)
			{
				if(s[j]>s[j+1])
				{
					x=s[j];
					s[j]=s[j+1];
					s[j+1]=x;
				}
			}
		}
		
	}
}
		