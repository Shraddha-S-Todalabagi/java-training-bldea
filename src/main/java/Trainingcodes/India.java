package Trainingcodes;

import java.util.Scanner;

public class India {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the values of n:");
		int n=sc.nextInt();

		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)/*I*/
			{
				if(j==n/4||i==0 && j<n/2||i==n-1 && j<n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("         ");
			for(int j=0;j<n;j++)/*L*/
			{
				if(j==0||i==n-1 && j<=n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++)/*O*/
			{
				if(j==0 && i!=0 && i!=n-1 || j==n/2 && i!=n-1 && i!=0 || i==0 && j<n/2 && j!=0 
						|| i==n-1 && j<n/2 && j!=0)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++)/*v*/
			{
				if(j==0 && i<=n/2 || j==n-1 && i<=n/2 || i-j==n/2 || i+j==(n-1)+(n/2))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("      ");
			for(int j=0;j<n;j++)/*E*/
			{
				if(j==0||i==n-1 && j<=n/2||i==n/2 && j<=n/2 ||i==0 && j<=n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("         ");
			for(int j=0;j<n;j++)/*M*/
			{
				if(j==0||j==n-1||i+j==(n-1) && i<=n/2 || i==j && i<=n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("      ");

			for(int j=0;j<n;j++)/*Y*/
			{
				if(j==n/2 && i>=n/2||i+j==(n-1) && i<=n/2 || i==j && i<=n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("         ");
			for(int j=0;j<n;j++)/*I*/
			{
				if(j==n/4||i==0 && j<n/2||i==n-1 && j<n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++)/*N*/
			{
				if(j==0||j==n-1||i==j)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.print("      ");
			for(int j=0;j<n;j++)/*D*/
			{
				if(j==1||j==(n/2)||(i==0 && j<=(n/2))||(i==(n-1) && j<=(n/2)))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++)/*I*/
			{
				if(j==n/4||i==0 && j<n/2||i==n-1 && j<n/2)
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			for(int j=0;j<n;j++)/*A*/
			{
				if(j==0 && i!=0||j==(n/2) && i!=0||(i==0 && j<(n/2) && j!=0)||(i==(n/2) && j<=(n/2)))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}
			System.out.println();
	}
	}

}
