package com.codility.assignment;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MaxCounterTest {

	@Test
	public void test() {
		assertArrayEquals(new int[]{3,2,2,4,2}, solution(5, new int[] {3,4,4,6,1,4,4}));
	}
	
	//77%
	public int[] solution1(int N, int[] A) {
		int[] counters = new int[N];
		int max = 0;
		for(int i=0; i<A.length;i++) {
			if(A[i]>0 && A[i]<=N) {
				counters[A[i]-1] = counters[A[i]-1]+1;
				if(max < counters[A[i]-1]) {
					max = counters[A[i]-1];	
				}
			}else {
				for(int j=0; j<N; j++) {
					counters[j] = max;
				}
			}
		}
		return counters;	
	}

	//100%
	public int[] solution(int N, int[] A) {
		int[] counters = new int[N];
		int lastMax = 0;
		int max = 0;
		
		for(int i=0; i<A.length;i++) {
			
			if(A[i]>0 && A[i]<=N) {
				
				if(counters[A[i]-1] < lastMax) {
					counters[A[i]-1] = lastMax;
				}
		
				counters[A[i]-1] = counters[A[i]-1]+1;
				
				if(max < counters[A[i]-1]) {
					max = counters[A[i]-1];	
				}
				
			}else {
				lastMax=max;
			}
			
		}
		
		for(int i=0; i<N;i++) {
			
			if(counters[i]<lastMax) {
				counters[i] = lastMax;
			}
			
		}
		
		return counters;	
	}

}
