package com.codility.assignment;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryGapTest {

	@Test
	public void test() {
		assertEquals(4, solution(34832239));
	}
	
	int solution(int N) {
		
		String s = Integer.toBinaryString(N);
		char c[] = s.toCharArray();
		int i=0, maxBinaryGap=0;
		while(i < c.length) {
			if(c[i]=='1') {
				int count = 0, j=i;
				while(j<c.length-1) {
					if(c[j+1]=='0') {
						count++;
					}
					if(c[j+1]=='1') {
						if(maxBinaryGap < count)
							maxBinaryGap=count;
						break;
					}
					j++;
				}
				
			}
			i++;
		}
		return maxBinaryGap;
		
	}
	

}
