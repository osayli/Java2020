package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumFinalSolution {
    public static void main(String[] args) {
        int[] nums={2,7,11,4};
        int target=6;
        int result[]=twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }


    public static  int[] twoSum(int[] nums, int target) {
        if(nums==null||nums.length<2){
            throw new IllegalArgumentException("Invalid input Array");
        }
        int[] output = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int idx = 0; idx < nums.length; idx++) {
            if (map.containsKey(target - nums[idx])) {
                output[1] = idx;
                output[0] = map.get(target - nums[idx]);
                return output;
            }
            map.put(nums[idx], idx);
        }
        throw new IllegalArgumentException("Invalid input, no Two Sum is found");
    }
}

