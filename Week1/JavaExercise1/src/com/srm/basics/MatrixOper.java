package com.srm.basics;

import java.util.Scanner;

class Matrices {
	void matrixAdd(int arr1[][], int arr2[][], int r, int c) {
		int[][] arr3 = new int[r][c];
		System.out.println("Resultant Matrix : ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr3[i][j] = arr1[i][j] + arr2[i][j];
				System.out.print(arr3[i][j] + "\t");
			}
			System.out.println();
		}
	}

	void matrixMul(int arr1[][], int arr2[][], int r, int c) {
		int[][] arr3 = new int[r][c];
		System.out.println("Result of Matrix Multiplication : ");
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				arr3[i][j] = 0;
				for (int k = 0; k < c; k++) {
					arr3[i][j] += arr1[i][k] * arr2[k][j];
				}
				System.out.print(arr3[i][j] + "\t");

			}
			System.out.println();
		}
	}
}

public class MatrixOper {

	public static void main(String[] args) {

		System.out.println("\nEnter the Operation : " + "\n1.Matrix Addition" + "\n2.Matrix Multilication");
		Scanner sc = new Scanner(System.in);
		int op = sc.nextInt();
		Matrices mat = new Matrices();
		switch (op) {
		case 1:
			System.out.println("Enter the Matrix1 : ");
			System.out.println("Enter the No.of.Rows :  ");
			int r1 = sc.nextInt();
			System.out.println("Enter the No.of.Cols :  ");
			int c1 = sc.nextInt();
			int[][] arr1 = new int[r1][c1];
			System.out.println("Enter the Matrix2 : ");
			System.out.println("Enter the No.of.Rows :  ");
			int r2 = sc.nextInt();
			System.out.println("Enter the No.of.Cols :  ");
			int c2 = sc.nextInt();
			int[][] arr2 = new int[r2][c2];
			System.out.println("Enter the Matrix1 : ");
			for (int i = 0; i < r1; i++) {
				for (int j = 0; j < c1; j++) {
					arr1[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter the Matrix2 : ");
			for (int i = 0; i < r2; i++) {
				for (int j = 0; j < c2; j++) {
					arr2[i][j] = sc.nextInt();
				}
			}
			mat.matrixAdd(arr1, arr2, r1, c1);
			break;
		case 2:
			System.out.println("Enter the Matrix1 : ");
			System.out.println("Enter the No.of.Rows :  ");
			int row1 = sc.nextInt();
			System.out.println("Enter the No.of.Cols :  ");
			int col1 = sc.nextInt();
			int[][] array1 = new int[row1][col1];
			System.out.println("Enter the Matrix2 : ");
			System.out.println("Enter the No.of.Rows :  ");
			int row2 = sc.nextInt();
			System.out.println("Enter the No.of.Cols :  ");
			int col2 = sc.nextInt();
			int[][] array2 = new int[row2][col2];
			System.out.println("Enter the Matrix1 : ");
			for (int i = 0; i < row1; i++) {
				for (int j = 0; j < col1; j++) {
					array1[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter the Matrix2 : ");
			for (int i = 0; i < row2; i++) {
				for (int j = 0; j < col2; j++) {
					array2[i][j] = sc.nextInt();
				}
			}
			mat.matrixMul(array1, array2, row1, col1);
			break;
		default:
			System.out.println("Invalid Operation");
		}

	}

}
