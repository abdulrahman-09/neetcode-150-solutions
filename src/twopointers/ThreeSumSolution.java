package twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSumSolution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            List<List<Integer>> subRes = twoSum(nums, -nums[i], i + 1, n - 1);
            for (List<Integer> pair : subRes) {
                pair.add(nums[i]);
                res.add(pair);
            }
        }
        return res;
    }

    private List<List<Integer>> twoSum(int[] numbers, int target, int start, int end) {
        List<List<Integer>> res = new ArrayList<>();
        while (start < end) {
            if (numbers[start] + numbers[end] > target) {
                end--;
            } else if (numbers[start] + numbers[end] < target) {
                start++;
            } else {
                List<Integer> pair = new ArrayList<>(3);
                pair.add(numbers[start]);
                pair.add(numbers[end]);
                res.add(pair);
                start++;
                end--;
                while (start < end && numbers[start] == numbers[start - 1]) start++;
                while (start < end && numbers[end] == numbers[end + 1]) end--;
            }
        }
        return res;
    }
}