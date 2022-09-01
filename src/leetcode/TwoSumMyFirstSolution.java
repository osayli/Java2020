package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class TwoSumMyFirstSolution {
    public static void main(String[] args) {
        int[] nums={2,3,3};
        int target=6;
        int result[]=twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] output=new int[2];
        List<Integer> numsList= IntStream.of(nums).boxed().collect(Collectors.toList());
        for(int i=0;i<nums.length;i++){
            int flag=target-nums[i];
            if (flag==nums[i]&&numsList.indexOf(flag)==numsList.lastIndexOf(flag)){
                continue;
            }
            if(numsList.contains(flag)){
                output[0]=i;
                int idx=numsList.lastIndexOf(flag);
                output[1]=idx;
                break;
            }
        }
        return output;
    }
}
