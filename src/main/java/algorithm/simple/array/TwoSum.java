package algorithm.simple.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by shionari on 2018/5/11
 */
public class TwoSum {
    public int[] solutino(int[] nums, int target) {
        int[] result = {0, 0};
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            temp.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer index = temp.get(target - nums[i]);
            if (index != null && i != index) {
                result[0] = i;
                result[1] = index;
                return result;
            }
        }
        throw new RuntimeException("no answer");
    }
}
