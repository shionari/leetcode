package algorithm.simple.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * 给定一个整数数组，判断是否存在重复元素。
 *
 * 如果任何值在数组中出现至少两次，函数返回 true。如果数组中每个元素都不相同，则返回 false。
 *
 * Created by shionari on 2018/5/11
 */
public class ContainsDuplicate {
    public boolean solution(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return false;
        }
        int max = nums[0];
        int min = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        boolean result = false;
        int[] temp = new int[max - min + 1];
        for (int num : nums) {
            int check = temp[num - min];
            if (check > 0) {
                result = true;
                break;
            } else {
                temp[num - min] = temp[num - min]++;
            }
        }
        return result;
    }
}
