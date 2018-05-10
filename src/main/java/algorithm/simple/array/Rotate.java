package algorithm.simple.array;

/**
 *
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * Created by shionari on 2018/5/10
 */
public class Rotate {
    public void solution(int[] nums, int k) {
        if (nums.length == 0 || nums.length == 1) {
            return;
        }
        int temp = 0;
        for (int i = 0; i < k; i++) {
            temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j++) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }
}
