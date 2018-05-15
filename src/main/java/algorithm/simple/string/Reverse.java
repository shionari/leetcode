package algorithm.simple.string;

/**
 *
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 *
 * 注意:
 *
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 *
 * Created by shionari on 2018/5/13
 */
public class Reverse {

    public static void main(String[] args) {
        int x = -2147483;
        System.out.println(solution(x));
    }

    public static int solution(int x) {
        if (x == 0) {
            return x;
        }
        boolean isNegative = false;
        long y = x;
        if (y < 0) {
            y = -y;
            System.out.println(y);
            isNegative = true;
        }

        char[] chars = String.valueOf(y).toCharArray();
        StringBuilder sb = new StringBuilder();
        boolean isStart = true;
        for (int i = chars.length - 1; i >= 0; i--) {
            if (isStart && chars[i] == '0' ) {
                continue;
            }
            isStart = false;
            sb.append(chars[i]);
        }

        long num = Long.decode(sb.toString());
        if (num > Integer.MAX_VALUE) {
            return 0;
        }
        if (isNegative) {
            num = - num;
        }
        return (int)num;
    }
}
