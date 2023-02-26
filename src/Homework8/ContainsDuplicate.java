package Homework8;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dublicatedNumb = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (dublicatedNumb.contains(nums[i])) {

            }
            dublicatedNumb.add(nums[i]);
        }
        return false;
    }
}
