package arrayshashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelfSolution {
    public int[] productExceptSelf(int[] nums) {
        int zeros = 0;
        int lastZeroIdx;
        int product = 1;
        int n = nums.length;
        int[] res = new int[n];
        for (int i : nums){
            if (i == 0)
                zeros++;
            else
                product *= i;
            if (zeros == 2){
                Arrays.fill(res, 0);
                return res;
            }
        };
        if (zeros == 0){
            for (int i = 0; i < n; i++) {
                res[i] = product / nums[i];
            }
        }
        if (zeros == 1){
            Arrays.fill(res, 0);
            for (int i = 0; i < n; i++) {
                if (nums[i] == 0)
                    res[i] = product;
            }
        }
        return res;
    }
}
