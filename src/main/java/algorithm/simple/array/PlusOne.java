package algorithm.simple.array;

import java.util.Arrays;

/**
 *
 * 给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * Created by shionari on 2018/5/11
 */
public class PlusOne {
    public int[] solutin(int[] digits) {
        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i] == 10) {
                digits[i] = 0;
                digits[i - 1] += 1;
            }
        }
        if (digits[0] < 10) {
            return digits;
        } else {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            digits[0] = 0;
            System.arraycopy(digits, 0, res, 1, digits.length);
            return res;
        }
    }
}
