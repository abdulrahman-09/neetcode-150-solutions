package arrayshashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutiveSequenceSolution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> values = new HashSet<>((int) (nums.length / 0.75));
        for (int i : nums) {
            values.add(i);
        }
        int longestConsecutive = 0;
        for(int i : values) {
            if (!values.contains(i - 1)){
                int count = 0;
                int val = i;
                while (values.contains(val)) {
                    count++;
                    val++;
                }
                longestConsecutive = Integer.max(longestConsecutive, count);
            }
        }
        return longestConsecutive;
    }
}
