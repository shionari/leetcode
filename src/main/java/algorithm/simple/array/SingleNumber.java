package algorithm.simple.array;

/**
 *
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * Created by shionari on 2018/5/11
 */
public class SingleNumber {

    /**
     * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
     *
     * 不使用额外空间的算法需要用到运算符异或"^"
     *
     * @param nums
     * @return
     */
    public int solution(int[] nums) {
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
        int[] temp = new int[max - min + 1];
        for (int num : nums) {
            temp[num - min] += 1;
        }
        int result = min;
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == 1) {
                result += i;
            }
        }
        return result;
    }
}
