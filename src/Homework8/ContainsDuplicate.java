package Homework8;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> dublicatedNumb = new HashSet<>();
        for (int num : nums) {
            if (dublicatedNumb.contains(num)) {
                return true;
            }
            dublicatedNumb.add(num);
        }
        return false;
    }
}
