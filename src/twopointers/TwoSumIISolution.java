package twopointers;

public class TwoSumIISolution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int start = 0, end = numbers.length - 1;
        while (start < end){
            if (numbers[start] + numbers[end] > target){
                end--;
            }else if (numbers[start] + numbers[end] < target){
                start++;
            }else {
                res[0] = start + 1;
                res[1] = end + 1;
                break;
            }
        }
        return res;
    }
}
