import java.util.*;
class rev
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		rev r=new rev();
		int i,l;
		System.out.println("Enter the length of array:");
		l=sc.nextInt();
		int a[]=new int[l];
		System.out.println("Enter any "+l+" numbers:");
		for(i=0;i<l;i++)
			a[i]=sc.nextInt();
		r.reverse(a);
	}
	public void reverse(int a[])
	{
		int i,j=a.length-1,x;
		for(i=0;i<a.length/2;i++)
		{
			x=a[i];
			a[i]=a[j];
			a[j]=x;
			j--;
		}
		System.out.print("Reversed Array:");
		for(i=0;i<a.length;i++)
			System.out.print(a[i]+" ");
	}	
}
		