package com.ap.company.interview.amazon;

import java.util.Scanner;

/**
 * Created by APandey on 05-04-2017.
 */
public class ConnecteCell {
	public static boolean[][] visitedIndexes;
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int m = scanner.nextInt();
		int n = scanner.nextInt();

		int[][] twoDArray = new int[m][n];
		visitedIndexes = new boolean[m][n];

		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				twoDArray[i][j] = scanner.nextInt();
				visitedIndexes[i][j] = false;
			}
		}

		int max = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(!visitedIndexes[i][j]) max = Math.max(max, calculateCount(twoDArray, i, j, 0, m, n));
			}
		}
		System.out.println(max);
	}

	public static int calculateCount(int[][] grid, int i, int j, int count, int m, int n) {
		if(i < 0 || j < 0 || i >= m || j >= n) return 0;
		if(visitedIndexes[i][j]) return 0;
		visitedIndexes[i][j] = true;
		if(grid[i][j] == 0) return 0;
		else return 1 +
				calculateCount(grid, i-1, j-1, count, m, n) +
				calculateCount(grid, i-1, j, count, m, n) +
				calculateCount(grid, i-1, j+1, count, m, n) +
				calculateCount(grid, i, j-1, count, m, n) +
				calculateCount(grid, i, j, count, m, n) +
				calculateCount(grid, i, j+1, count, m, n) +
				calculateCount(grid, i+1, j-1, count, m, n) +
				calculateCount(grid, i+1, j, count, m, n) +
				calculateCount(grid, i+1, j+1, count, m, n);
	}
}
