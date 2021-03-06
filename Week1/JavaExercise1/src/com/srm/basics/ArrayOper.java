package com.srm.basics;

import java.util.Scanner;

class ArrayDemo
{
	void oneDimension(int[] arr)
	{
		System.out.println("Length of Array : "+arr.length);
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
	void twoDimension(int[][] arr1,int[][] arr2)
	{
		int[][] c=new int[arr1.length][arr2.length];
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				c[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
public class ArrayOper {
	public static void main(String[] args) {
		ArrayDemo ad=new ArrayDemo();
		System.out.println("Enter the No.of.Elements : ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println();
		ad.oneDimension(arr);
		System.out.println("Enter the No.of.Rows : ");
		int r=sc.nextInt();
		System.out.println("Enter the No.of.Cols : ");
		int c=sc.nextInt();
		int[][] a=new int[r][c];
		int[][] b=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		ad.twoDimension(a,b);
	}

}
