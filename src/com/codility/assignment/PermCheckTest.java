package com.codility.assignment;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class PermCheckTest {

	@Test
	public void test() {
		assertEquals(1, solution(new int[]{2,3,4,1}));
		assertEquals(0, solution(new int[]{2,3,4}));
		assertEquals(0, solution(new int[]{1,3,4}));
		assertEquals(0, solution(new int[]{1,2,4}));
		assertEquals(1, solution(new int[]{1,2,3}));
		assertEquals(0, solution(new int[]{1,4,1}));
	}
	
	//66% overall
	public int solution1(int[] A) {
		for(int i=1; i <=A.length; i++) {
			int count = 0;
			for(int j =0; j<A.length; j++) {
				if(i == A[j]){
					count++;
				}
			}
			if(count!=1) {
				return 0;
			}
		}
		
		return 1;
	}
	
	//100% overall
	public int solution(int[] A) {
		Arrays.sort(A);
		for(int i = 1; i<=A.length; i++) {
			if(A[i-1] != i) {
				return 0;
			}
		}
		return 1;
	}
	

}
