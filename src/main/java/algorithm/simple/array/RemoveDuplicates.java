package algorithm.simple.array;

/**
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * Created by shionari on 2018/5/9
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] test = {1,1,2};// answer is [1,2]
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int length = removeDuplicates.solution(test);
        StringBuilder sb = new StringBuilder();
        System.out.println(length == 2);
    }

    public int solution(int[] nums) {
        if (nums.length == 0) return 0;
        int length = 1;
        int mark = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (mark != nums[i]) {
                mark = nums[i];
                if (length != i) {
                    nums[length - 1] = mark;
                }
                length++;
            }
        }
        return length;
    }

    private boolean isDuplicate(int[] nums, int check, int length) {
        boolean isDuplicate = false;
        for (int j = 0; j <= length - 1; j++) {
            if (check == nums[j]) {
                isDuplicate = true;
                break;
            }
        }
        return isDuplicate;
    }
}
