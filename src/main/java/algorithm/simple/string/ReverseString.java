package algorithm.simple.string;

/**
 *
 * 请编写一个函数，其功能是将输入的字符串反转过来。
 *
 * Created by shionari on 2018/5/13
 */
public class ReverseString {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }

    public String solutino2(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }
        char[] chars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(s.length() - 1 - i);
        }
        return new String(chars);
    }
}
