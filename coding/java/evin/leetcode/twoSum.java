package evin.leetcode;

import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0] + " " + ints[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
            int rem = target - nums[index];
            if (map.containsKey(rem)) {
                return new int[]{map.get(rem), index};
            }
            map.put(nums[index], index);
        }
        return new int[]{};

    }
}
