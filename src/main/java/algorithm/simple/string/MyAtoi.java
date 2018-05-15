package algorithm.simple.string;

/**
 *
 * 实现 atoi，将字符串转为整数。
 *
 * 在找到第一个非空字符之前，需要移除掉字符串中的空格字符。如果第一个非空字符是正号或负号，选取该符号，并将其与后面尽可能多的连续的数字组合起来，这部分字符即为整数的值。如果第一个非空字符是数字，则直接将其与之后连续的数字字符组合起来，形成整数。
 *
 * 字符串可以在形成整数的字符后面包括多余的字符，这些字符可以被忽略，它们对于函数没有影响。
 *
 * 当字符串中的第一个非空字符序列不是个有效的整数；或字符串为空；或字符串仅包含空白字符时，则不进行转换。
 *
 * 若函数不能执行有效的转换，返回 0。
 *
 * 说明：
 *
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1]。如果数值超过可表示的范围，则返回  INT_MAX (231 − 1) 或 INT_MIN (−231) 。
 *
 * Created by shionari on 2018/5/15
 */
public class MyAtoi {
    public int solution(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        char[] chars = str.toCharArray();
        char[] nums = new char[str.length()];
        int count = 0;
        boolean isNegative = false;
        boolean isStart = false;
        for (char c : chars) {
            if (c >= '0' && c <= '9') {
                isStart = true;
                nums[count++] = c;
            } else if (!isStart && c == '-') {
                isNegative = true;
                isStart = true;
            } else if (!isStart && c== '+') {
                isNegative = false;
                isStart = true;
            } else if (!isStart && c== ' ') {
                // do nothing
            } else {
                break;
            }
        }

        if (count == 0) {
            return 0;
        }

        int start = 0;
        for (char c : nums) {
            if (c != '0') {
                break;
            }
            start++;
        }

        if (count - start == 0) {
            return 0;
        }
        if (count - start> 10) {
            if (isNegative) {
                return Integer.MIN_VALUE;
            } else {
                return Integer.MAX_VALUE;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (isNegative) {
            sb.append('-');
        }
        for (int i = start; i < count; i++) {
            sb.append(nums[i]);
        }
        long num = Long.valueOf(sb.toString());
        if (num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        } else {
            return (int)num;
        }
    }
}
