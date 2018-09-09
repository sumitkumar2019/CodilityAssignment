package com.codility.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrogRiverOneTest {
	@Test
	public void test() {
		assertEquals(6, solution(5, new int[] {1,3,1,4,2,3,5,4}));
		assertEquals(-1, solution(2, new int[] {2,2,2,2,2}));
		assertEquals(1, solution(2, new int[] {2,1,3,4,5}));
	}

	public int solution(int X, int[] A) {
		
		int x[] = new int[X+1];
		
		for(int i = 0; i<A.length; i++) {
			
			if(x[A[i]] != A[i]) {
				x[A[i]] = A[i];
				X--;
				if(X == 0) {
					//return time
					return i;
				}
			}
		}
		return -1;
		
	}

}
