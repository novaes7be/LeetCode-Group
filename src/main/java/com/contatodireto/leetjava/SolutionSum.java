package com.contatodireto.leetjava;

import java.util.HashMap;
import java.util.Map;

public class SolutionSum {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[]{};
        Map<Integer, Integer> sum = new HashMap<>();


        for (int i = 0; i < nums.length; i++) {
            int comp = target - nums[i];
            if (sum.containsKey(comp)) {
                arr = new int[]{i, sum.get(comp)};
                break;
            } else {
                sum.put(nums[i],i);
            }
        }
        return arr;
    }
}