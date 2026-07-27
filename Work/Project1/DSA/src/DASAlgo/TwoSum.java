/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DASAlgo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SOFTWARE
 */
public class TwoSum {
    
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res = twosum(nums, target);
        System.out.println(Arrays.toString(res));
        
    }
    
    public static int[] twosum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        
        return new int[]{};
    }
}
