package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums = {2, 11, 7, 15};
        int target = 9;

//        int[] nums = {3, 2, 4};
//        int target = 6;
//        int[] nums = {3, 3};
//        int target = 6;
        int[] result = twoSum(nums, target);

        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }

    public static int[] twoSum(int[] nums, int target) {

       // int[] output = new int[2];

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//
//                if (nums[i] + nums[j] == target) {
//                    output[0] = i;
//                    output[1] = j;
//                    return output;
//                }
//            }
//        }
        Map<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (ans.containsKey(target - nums[i])) {
                return new int[]{i, ans.get(target - nums[i])};
            }
            ans.put(nums[i], i);
        }

        return new int[]{};

    }
}
