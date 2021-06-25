package com.srm.basics;

import java.util.Scanner;

public class RowColSum {
public static void main(String args[])
{
	int rsum=0,csum=0;
	System.out.println("Enter the No.of.Rows : ");
	Scanner sc=new Scanner(System.in);
	int row=sc.nextInt();
	System.out.println("Enter the No.of.Cols : ");
	int cols=sc.nextInt();
	int[][] arr=new int[row][cols];
	System.out.println("Enter the Matrix : ");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<cols;j++)
		{
			arr[i][j]=sc.nextInt();
		}
	}
	System.out.println("Matrix : ");
	for(int i=0;i<row;i++)
	{
		for(int j=0;j<cols;j++)
		{
			System.out.print(arr[i][j]+"\t");
		}
		System.out.println();
	}
	System.out.println("Row Sum of Matrix");
	int[] col=new int[cols];
	for(int i=0;i<row;i++)
	{
		rsum=0;
		csum=0;
		for(int j=0;j<cols;j++)
		{
			rsum=rsum+arr[i][j];
			csum=csum+arr[j][i];
			System.out.print(arr[i][j]+"\t");
			
		}
		col[i]=csum;
		System.out.print(+rsum+"\t");
		System.out.println();
	}
	for(int i=0;i<col.length;i++)
	{
		System.out.print(col[i]+"\t");
	}
	
	System.out.println();
	
}
}
