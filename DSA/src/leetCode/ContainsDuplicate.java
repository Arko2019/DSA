package leetCode;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = {1, 2, 3, 1, 1, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int s=map.get(nums[i]) - i;
                if ((i-map.get(nums[i]) ) > k) {
                    return false;
                }
            } else {
                map.put(nums[i], i);
            }

        }
        return true;
    }

}
