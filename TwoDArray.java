import java.util.*;
class TwoDArray
{
	public static void main(String args[])
	{
		int r,c,i,j,x=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows and columns:");
		r=sc.nextInt();
		c=sc.nextInt();
		int a[][]=new int[r][c];
		System.out.println("Enter the Elements:");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
				a[i][j]=sc.nextInt();
		}
		for(i=0;i<r;i++)
		{
			if(x==0)
			{
				for(j=x;j<c;j++)
					System.out.print(a[i][j]+",");
				x=c-1;
			}
			else
			{
				for(j=x;j>=0;j--)
					System.out.print(a[i][j]+",");
				x=0;
			}
		}
	}
}
		