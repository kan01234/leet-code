package com.kan01234.leet.code.java.q39;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        backtrack(results, new ArrayList<>(), candidates, target, 0);
        return results;
    }

    private void backtrack(List<List<Integer>> results, List<Integer> nums, int[] candidates, int target, int start) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            results.add(new ArrayList<Integer>(nums));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            nums.add(candidates[i]);
            backtrack(results, nums, candidates, target - candidates[i], i);
            nums.remove(nums.size() - 1);
        }
    }
}
