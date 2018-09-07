package com.codility.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PermMissingElemTest {

	@Test
	public void test() {
		assertEquals(4, solution3(new int[] {2,3,1,5}));
	}
	/*
	 * 80 %
	 * */
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
	
	/*
	 * 60 %
	 * */
	public int solution2(int[] A) {
		
		for(int i =1 ; i<=A.length+1 ; i++) {
			boolean match = false;
			for(int j =0; j<A.length; j++)
			if(A[j]==i) {
				match = true;
				break;
			}
			
			if(!match) {
				return i;
			}
			
		}
		return 0;
	}
	
/*
 * 100%
 * */
public int solution3(int[] A) {
	long N = A.length + 1;
    long total = N * (N + 1) / 2;

    for (int i : A) {

        total -= i;
    }

    return (int)total;
	}
	
	
	
	
	

}

