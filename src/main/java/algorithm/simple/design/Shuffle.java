package algorithm.simple.design;

import java.util.Random;

/**
 *
 * 打乱一个没有重复元素的数组。
 *
 * Created by shionari on 2018/5/22
 */
public class Shuffle {

    int[] nums;

    public Shuffle(int[] nums) {
        this.nums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] result = new int[nums.length];
        int[] isUse = new int[nums.length];
        Random random = new Random(System.nanoTime());
        for (int i = 0; i < nums.length; i++) {
            int site = random.nextInt(nums.length);
            while (isUse[site] != 0) {
                site = random.nextInt(nums.length);
            }
            isUse[site] = -1;
            result[i] = nums[site];
        }
        return result;
    }
}
