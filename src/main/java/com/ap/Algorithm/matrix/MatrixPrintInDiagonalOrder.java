package com.ap.Algorithm.matrix;

/**
 * Created by APandey on 04-04-2017.
 */
//http://www.ideserve.co.in/learn/print-matrix-diagonally
public class MatrixPrintInDiagonalOrder {
	public static void main(String[] args) {
		int arr[][] = new int[4][5];
		int k=1;
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = k++;
			}
		}
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		printDiagonally(arr, 5, 4);
	}

	public static  void printDiagonally(int[][] matrix, int m, int n) {
		for (int i=0; i<m; i++) {
			for(int j=i<n?i:n; j>=0 && j<n; j--) {
				//System.out.print("[" + (i-j) + "]" + "["+ j +  "]" + "  ");
				System.out.print(matrix[j][i-j] + "  ");
			}
			System.out.println("");
		}

		int k=n-1;
		for (int i=1; i>=0; i--) {
			for(int j=0; j<m-1 && (i-j) >=0; j++) {
				//System.out.print("[" + i + "]" + "["+ (i-j) +  "]" + "  ");
				System.out.print(matrix[k-j][j+1] + "  ");
			}
			System.out.println("");
		}
	}
}
