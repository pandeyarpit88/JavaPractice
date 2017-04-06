package com.ap.company.interview.amazon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by APandey on 05-04-2017.
 */
public class MaxSubArray {
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Integer noOfTests = scanner.nextInt();
		assert 1<= noOfTests && noOfTests<=10;
		List<Integer[]> list = new ArrayList<Integer[]>();
		for(int i=0; i<noOfTests; i++) {
			Integer elementCount = scanner.nextInt();
			Integer arr[] = new Integer[elementCount];
			assert 1 <= elementCount && elementCount < 100000;
			for (int j=0; j<elementCount; j++) {
				arr[j] = scanner.nextInt();
			}
			list.add(arr);
		}

		for(Integer[] arr : list) {
			System.out.print(getMaximumSumSubArrayContiguous(arr));
			System.out.print(" ");
			System.out.print(getMaximumSumForNonContiguousElements(arr));
			System.out.println();
		}
	}

	public static int getMaximumSumSubArrayContiguous(Integer[] arr) {
		int contSum = arr[0];
		int prevContSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (contSum < 0 && arr[i] >= 0) {
				contSum = arr[i];
			} else {
				contSum += arr[i];
			}
			if (contSum >= prevContSum) {
				prevContSum = contSum;
			} else if (contSum < 0) {
				contSum = arr[i];
			}
		}
		return contSum > prevContSum ? contSum : prevContSum;
	}

	private static int getMaximumSumForNonContiguousElements(Integer[] arr) {
		int sum = 0;
		//Sum of only positive numbers
		for (int element : arr) {
			if (element >= 0) {
				sum += element;
			}
		}

		//If all numbers are negative
		if(sum == 0) {
			return getMaxNumber(arr);
		}
		return sum;
	}

	public static int getMaxNumber(Integer[] arr) {
		Integer num = arr[0];
		for(int i=1; i<arr.length; i++) {
			if(num < arr[i])
				num = arr[i];
		}
		return num;
	}
}
