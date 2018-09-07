package com.codility.assignment;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class OddOccurancesInArrayTest {

	@Test
	public void test() {
		assertEquals(2, solution(new int[] {2,2,2,2,2,2,2}));
	}
	
	public int solution(int[] A) {
		Arrays.sort(A);
		int i = 0,position=0;
		while(i<A.length-1) {
			if(A[i]!=A[i+1]) {
				break; 
			}
			i=i+2;
			position=i;
		}
		return A[position];
		
	}
	

}

