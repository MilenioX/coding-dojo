package com.mundox.leetcode.gasstation;
public class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        if (gas==null || cost==null || gas.length==0 || cost.length ==0)
            return -1;
        int sum = 0;
        int index = -1;
        int weightSinceIndex=0;
        for (int i=0;i<gas.length;i++) {
            int weight = gas[i]-cost[i];

            if (weight>=0 && index==-1) {
                index = i;
                weightSinceIndex = weight;
            } else if (index!=-1) {
                if (weightSinceIndex+weight<0)
                    index=-1;
                else
                    weightSinceIndex += weight;
            }

            sum += weight;
        }
        return (sum>=0)?index:-1;
    }
}
