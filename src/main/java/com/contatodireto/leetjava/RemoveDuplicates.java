package com.contatodireto.leetjava;

import java.util.*;

class RemoveDuplicates {

    public int removeDuplicates(int[] nums) {
        int k = 0;
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            arrayList.add(nums[i]);
        }
        Set<Integer> setInt = new LinkedHashSet<>(arrayList);

        int index = 0;
        for (int val : setInt) {
            nums[index] = val;
            index++;
        }
        k = index;
        return k;
    }
}
