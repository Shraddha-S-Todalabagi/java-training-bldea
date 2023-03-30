package Trainingcodes;

import java.util.Scanner;

public class Shraddha {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the values of n:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)/*S*/
			{
				if((i==0 && j<=(n/2) && j!=0)||(i==(n/2) && j<(n/2) && j!=0)||(i==(n-1) && j<(n/2))||
						(j==0 && i<(n/2) && i!=0)||(j==(n/2) && i!=(n-1) && i>(n/2)))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}

			for(int j=0;j<n;j++)/*H*/
			{
				if(j==0||j==(n/2)||(i==(n/2) && j<=(n/2)))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}

			for(int j=0;j<n;j++)/*R*/
			{
				if(j==0||(i==0 && j<(n/2))||(i==(n/2) && j<(n/2))||(j==(n/2) && i!=0 && i<(n/2))||(i-j==(n/2)))
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
				if(j==0||j==(n/2)||(i==0 && j<=(n/2))||(i==(n/2) && j<=(n/2)))
				{
					System.out.print("* ");
				}
				else
				{
					System.out.print("  ");
				}
			}

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
			for(int j=0;j<n;j++)/*H*/
			{
				if(j==0||j==(n/2)||(i==(n/2) && j<=(n/2)))
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
				if(j==0||j==(n/2)||(i==0 && j<=(n/2))||(i==(n/2) && j<=(n/2)))
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
