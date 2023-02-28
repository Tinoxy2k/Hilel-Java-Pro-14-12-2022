package Homework8;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int number;
        Map<Integer, Integer> integerMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            number = target - nums[i];
            if (integerMap.containsKey(number)) {
                return new int[]{integerMap.get(number), i};
            }
            integerMap.put(nums[i], i);
        }
        return null;
    }
}