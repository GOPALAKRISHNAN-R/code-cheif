import java.util.Arrays;
import java.util.Scanner;

/**
 * Simple Java program 
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class Johny
{
	public static void main(String args[])
	{
		int t;//test case
		int n;
		
		Scanner sc=new Scanner(System.in);
		//System.out.println("Enter test cases:");
		t=sc.nextInt();
		
		if(t<=100)
		{
			for(int i=0;i<t;i++)
			{
		//		System.out.println("Enter how many songs:");
				n=sc.nextInt();
				
				int a[]=new int[n];
				
				if(n<=100)
				{
					for(int j=0;j<n;j++)
					{
						a[j]=sc.nextInt();
					}
					//Arrays.sort(a);
		//			System.out.println("enter search element:");
					int k=sc.nextInt();
					k=k-1;
					for(int j=0;j<n;j++)
					{
						if(j==k)
						{
							System.out.println(a[j]);
						}
					}						
				}
			}
		}
	}

}
