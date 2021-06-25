package com.srm.basics;

import java.util.Scanner;

public class TransposeMatrix {

	public static void main(String[] args) {
		
		System.out.println("Enter the No.of.Rows : ");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		System.out.println("Enter the No.of.Colums : ");
		int cols=sc.nextInt();
		int[][] arr=new int[row][cols];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<cols;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Actual Matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		int[][] transarr=new int[row][cols];
		System.out.println("Transpose Matrix");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<cols;j++)
			{
				transarr[i][j]=arr[j][i];
			}
		}
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(transarr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
