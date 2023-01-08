package com.mundox.leetcode.gasstation;

import org.junit.Ignore;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SolutionTest {
  @Test
  public void test_fullCircuit(){
      Solution sol = new Solution();
      int[] gas = {1,2,3,4,5};
      int[] cost = {3,4,5,1,2};
      sol.canCompleteCircuit(gas, cost);
      assertEquals(3, sol.canCompleteCircuit(gas, cost));
  }
    @Test
    public void test_noCircuitComplete(){
        Solution sol = new Solution();
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};
        assertEquals(-1, sol.canCompleteCircuit(gas, cost));
    }

    @Test
    public void test_CircuitComplete(){
        Solution sol = new Solution();
        int[] gas = {4,5,3,1,4};
        int[] cost = {5,4,3,4,2};
        assertEquals(-1, sol.canCompleteCircuit(gas, cost));
    }

    @Test
    public void test_CircuitComplete2(){
        Solution sol = new Solution();
        int[] gas = {5,1,2,3,4};
        int[] cost = {4,4,1,5,1};
        assertEquals(4, sol.canCompleteCircuit(gas, cost));
    }

    @Test
    public void test_CircuitComplete3(){
        Solution sol = new Solution();
        int[] gas = {3,1,1};
        int[] cost = {1,2,2};
        assertEquals(0, sol.canCompleteCircuit(gas, cost));
    }

    @Test
    public void test_CircuitComplete4(){
        Solution sol = new Solution();
        int[] gas = {5,8,2,8};
        int[] cost = {6,5,6,6};
        assertEquals(3, sol.canCompleteCircuit(gas, cost));
    }

    @Test
    public void test_CircuitComplete5(){
        Solution sol = new Solution();
        int[] gas = {2,0,1,2,3,4,0};
        int[] cost = {0,1,0,0,0,0,11};
        assertEquals(0, sol.canCompleteCircuit(gas, cost));
    }
}
