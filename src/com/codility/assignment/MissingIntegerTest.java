package com.codility.assignment;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class MissingIntegerTest {

    @Test
    public void test() {
    assertEquals(5, solution(new int[] { 1, 3, 6, 4, 1, 2}));
    assertEquals(4, solution(new int[] { 1, 2, 3}));
      int A[] =new int[100000];

      for(int i=0;i<A.length;i++){
          A[i]=i+1;
      }
        assertEquals(100001, solution(A));
    assertEquals(1, solution(new int[] { -1, -3}));
    }

    /*
    *Correct Solution: Performance: O(N**2):55%
    * */
    public int solution1(int[] A) {
        Arrays.sort(A);
        for(int i=1;i<=A.length;i++){
            int count =0;
            for(int j=0;j<A.length;j++){
                if(i!=A[j]){
                    count++;
                }else{
                    break;
                }
            }
            if(count == A.length){
                return i;
            }
        }
        return A[A.length-1]+1;
    }

    /*
     *Correct Solution: Performance: O(N**2):66%
     * */
    public int solution2(int[] A) {
        Arrays.sort(A);
        boolean[] sequence = new boolean[A.length+1];
        int found = 1;
        for(int i=0;i<A.length;i++){
            if(found == A[i]){
                sequence[found] = true;
                found++;
                i=0;
            }
        }
        for(int i=1; i<sequence.length;i++){
            if(!sequence[i]){
                return i;
            }
        }
        return A[A.length-1]+1;
    }

    /*
     *Correct Solution: Performance:O(N) or O(N * log(N)):88%
     * */
    public int solution3(int[] A) {
        boolean[] sequence = new boolean[A.length+1];
        for(int i=0;i<A.length;i++){
            if(!(A[i]<=0) && A[i]<=A.length){
                sequence[A[i]]=true;
            }
        }
        for(int i=1; i<sequence.length;i++){
            if(!sequence[i]){
                return i;
            }
        }
        return A[A.length-1]+1;
    }

    /*
     *Correct Solution: Performance:O(N) or O(N * log(N)):100% (Internet Solution)
     * */
    public int solution(int[] A) {
        HashSet<Integer> seen = new HashSet<Integer>();
        int min = 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) seen.add(A[i]);
        }

        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if (!seen.contains(i)) return i;
        }

        return min;
    }

}
