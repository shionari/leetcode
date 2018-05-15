package algorithm.simple.string;

/**
 *
 * 给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * Created by shionari on 2018/5/15
 */
public class IsPalindrome {
    public boolean solution(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        char[] chars = s.toCharArray();
        char[] after = new char[chars.length];
        int count = 0;
        for (char c : chars) {
            if ((c >= '0' && c <= '9') || (c >='a' && c <= 'z')) {
                after[count++] = c;
            } else if (c >='A' && c <= 'Z') {
                after[count++] = (char)(c - ('A' - 'a'));
            }
        }
        boolean result = true;
        for (int i = 0; i < count / 2; i++) {
            if (after[i] != after[count - 1 - i]) {
                result = false;
            }
        }
        return result;
    }
}
