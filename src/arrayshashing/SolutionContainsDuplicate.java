package arrayshashing;

import java.util.HashSet;
import java.util.Set;

public class SolutionContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>((int) (nums.length / 0.75));
        for(int i : nums){
            if(set.contains(i)){
                return true;
            }
            set.add(i);
        }
        return false;

    }
}
