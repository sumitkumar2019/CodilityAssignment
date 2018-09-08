package com.codility.assignment;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class TapeEquilibriumTest {

	@Test
	public void test() {
		assertEquals(1, solution(new int[] { 3, 1, 2, 4, 3 }));
	}

	//O(N^2) - Feasible Solution
	public int solution1(int[] A) {
		int n = A.length;
		int diff[] = new int[n - 1];
		for (int p = 1; p < A.length; p++) {
			diff[p - 1] = Math.abs(sum(0, p - 1, A) - sum(p, n - 1, A));
		}
		Arrays.sort(diff);
		return diff[0];
	}

	//O(N^2) - Feasible Solution
	public int solution2(int[] A) {
		int n = A.length;
		int diff[] = new int[n - 1];
		int firstPartSum = 0;
		int secondPartSum = 0;
		for (int p = 1; p < A.length; p++) {

			firstPartSum += A[p - 1];
			secondPartSum = sum(p, n - 1, A);
			diff[p - 1] = Math.abs(firstPartSum - secondPartSum);
		}
		Arrays.sort(diff);
		return diff[0];
	}

	//O(N) - Optimal Solution
	public int solution(int[] A) {
		int n = A.length;
		int diffMin = 0;
		int diffMax = 0;
		int sum = sum(0,n-1,A);
		int firstPartSum = 0;
		int secondPartSum = 0;
		for (int p = 0; p < A.length - 1; p++) {
			firstPartSum += A[p];
			secondPartSum = sum - firstPartSum;
			diffMax = Math.abs(firstPartSum - secondPartSum);
			if (p != 0) {
				if (diffMax < diffMin) {
					diffMin = diffMax;
				}
			} else {
				diffMin = diffMax;
			}
		}
		return diffMin;
	}

	public int sum(int start, int end, int[] A) {
		int sum = 0;
		for (int i = start; i <= end; i++) {
			sum += A[i];
		}
		return sum;
	}

}
