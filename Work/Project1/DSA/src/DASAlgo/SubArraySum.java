/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DASAlgo;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author SOFTWARE
 */
public class SubArraySum {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        System.out.println(subarraysum(nums, k));
    }

    public static int subarraysum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        int prefixsum = 0;
        int count = 0;

        for (int num : nums) {
            prefixsum += num;

            if (map.containsKey(prefixsum - k)) {
                count += map.get(prefixsum - k);
            }

            map.put(prefixsum, map.getOrDefault(prefixsum, 0) + 1);
        }

        return count;
    }
}
