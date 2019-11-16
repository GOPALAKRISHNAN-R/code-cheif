package life_universe_everything;

import java.util.Scanner;

/**
 * Simple Java program 
 * @author R.GOPALAKRISHNAN
 * @author www.rgopalakrishnanmca.simplesite.com
 **/

public class Test {
		public static void main(String args[])
		{
			int n;
			System.out.println("enter n val:");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			int a[]=new int[n+1];
			for(int i=0;i<=n;i++)
			{
				if(a[i]<100)
				{
					a[i]=sc.nextInt();
				}
			}
			
			for(int i=0;i<=n;i++)
			{
				if(a[i]==42)
				{
					break;
				}
				System.out.println(a[i]);
			}		
		}
}
