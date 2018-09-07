package com.codility.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TapeEquilibriumTest {

	@Test
	public void test() {
		assertEquals(4, solution(new int[] {2,3,1,5}));
	}
	
	
	public int solution(int[] A) {
		int n = A.length+1;
		int sum = (n*(n+1))/2;
		int arraySum = 0; 
		int i=0;
		while(i<A.length) {
			arraySum+=A[i];
			i++;
		}
		return sum - arraySum;
	}

}

