import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class TestClass {
	public static void main(String args[] ) throws Exception {
		Scanner scanner = new Scanner(System.in);
		Integer noOfTests = scanner.nextInt();
		assert 1<= noOfTests && noOfTests<=10;
		List<Integer[]> list = new ArrayList<Integer[]>();
		for(int i=0; i<noOfTests; i++) {
			Integer elementCount = scanner.nextInt();
			int arr[] = new int[elementCount];
			assert 1 <= elementCount && elementCount < 100000;
			for (int j=0; j<elementCount; j++) {
				arr[j] = scanner.nextInt();
			}
			long[] x = findMaximumSum(arr, arr.length);
			for (long var : x) {
				System.out.print(var + " ");
			}
			System.out.println();
		}

		/*for(Integer[] arr : list) {
			System.out.print(getMaximumSumSubArrayContiguous(arr));
			System.out.print(" ");
			System.out.print(getMaximumSumForNonContiguousElements(arr));
			System.out.println();
		}*/
	}


	private static long[] findMaximumSum(int[] array, int length) {
		long[] result = new long[2];
		long contSum = array[0];
		long prevContSum = array[0];
		long nonContSum = array[0];
		for (int i = 1; i < length; i++) {
			if (contSum < 0 && array[i] >= 0) {
				contSum = array[i];
			} else {
				contSum += array[i];
			}
			if (nonContSum < 0 && array[i] >= 0) {
				nonContSum = array[i];
			} else if (nonContSum + array[i] > nonContSum) {
				nonContSum += array[i];
			} else if (nonContSum < array[i] && nonContSum + array[i] < nonContSum) {
				nonContSum = array[i];
			}
			if (contSum >= prevContSum) {
				prevContSum = contSum;
			} else if (contSum < 0) {
				contSum = array[i];
			}
		}
		result[0] = contSum > prevContSum ? contSum : prevContSum;
		result[1] = nonContSum;
		return result;
	}

	public static Integer getMaximumSumSubArrayContiguous(Integer[] arr) {
		int sum = 0, ans = 0;
		for (int i = 0; i < arr.length; i++) {
			if (sum + arr[i] > 0) {
				sum += arr[i];
			} else {
				sum = 0;
			}
			ans = Math.max(ans, sum);
		}
		return ans;
	}

	private static int getMaximumSumForNonContiguousElements(Integer[] arr) {
		int sum = 0;
		for (int element : arr) {
			if (element >= 0) {
				sum += element;
			}
		}
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
