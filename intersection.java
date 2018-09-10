import java.util.*;
class intersection
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		intersection in=new intersection();
		int s1,s2,s3,i;
		System.out.print("Enter the size of the 1st array:");
		s1=sc.nextInt();
		int a1[]=new int[s1];
		System.out.println("Enter any "+s1+" elements:");
		for(i=0;i<s1;i++)
			a1[i]=sc.nextInt();
		System.out.print("Enter the size of the 2nd array:");
		s2=sc.nextInt();
		int a2[]=new int[s2];
		System.out.println("Enter any "+s2+" elements:");
		for(i=0;i<s2;i++)
			a2[i]=sc.nextInt();
		int a3[]=new int[s1+s2];
		s3=s1+s2;
		a3=in.sec(a1,a2,s3);
		System.out.println("Intersection=");
		in.sort(a3);
		for(i=0;i<s1+s2;i++)
		{
			if(a3[i]==0)
				break;
			System.out.println(a3[i]);
		}	
	}
	public int[] sec(int a1[],int a2[],int s3)
	{
		int i,j,c=0;
		int a[]=new int[s3];
		for(i=0;i<a1.length;i++)
		{
			for(j=0;j<a2.length;j++)
			{
				if(a1[i]==a2[j])
				{
					a[c]=a1[i];
					c++;
					break;
				}
			}
		}
		return a;
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
		