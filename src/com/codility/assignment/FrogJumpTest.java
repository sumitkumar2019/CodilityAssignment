package com.codility.assignment;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrogJumpTest {

	@Test
	public void test() {
		assertEquals(1, solution(5, 105, 3));
	}
	
	public int solution(int X, int Y, int D) {
			return (int) Math.ceil((double)(Y-X)/D);
	}
	

}

