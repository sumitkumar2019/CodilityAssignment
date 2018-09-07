package com.codility.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class CyclicRotationTest {

	@Test
	public void test() {
		assertArrayEquals(new int[] {}, solution(new int[] {}, 3));
	}
	
	public int[] solution(int[] A, int K) {
		
		if(null!=A && A.length !=0) {
			
			int size = A.length;

			for(int i=0;i<K;i++) {
				
				int temp[] = new int[size];
				
				temp[0] = A[size-1];
				
				for(int j=1; j<size; j++) {
					
					temp[j] = A[j-1];
				
				}
				
				A = temp;
			}
		}
				
		return A;	
	}
	

}

