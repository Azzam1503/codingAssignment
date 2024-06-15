import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int remaining = target - nums[i];
            if (numMap.containsKey(remaining) && numMap.get(remaining) != i) {
                return new int[] { i, numMap.get(remaining) };
            }
        }

        return null;
    }
}
