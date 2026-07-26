package arrayshashing;

import java.util.*;

public class TopKFrequentElementsSolution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        List<List<Integer>> buckets = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            buckets.add(new ArrayList<>());
        }
        Map<Integer, Integer> freq = new HashMap<>((int) ((n + 1) / 0.75));
        int[] res = new int[k];
        for (int i : nums) {
            freq.merge(i, 1, Integer::sum);
        }
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            buckets.get(entry.getValue()).add(entry.getKey());
        }
        int count = 0;
        for (int i = n; i > 0 && count < k; i--){
            int m = buckets.get(i).size();
            for (int c = 0; c < m && count < k; c++){
                res[count] = buckets.get(i).get(c);
                count++;
            }
        }
        return res;
    }
}
