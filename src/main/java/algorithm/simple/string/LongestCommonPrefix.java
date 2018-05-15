package algorithm.simple.string;

/**
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * Created by shionari on 2018/5/15
 */
public class LongestCommonPrefix {

    public static void main(String[] args) {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] strs = {"flower","flow","flight"};
        longestCommonPrefix.solution(strs);
    }

    public String solution(String[] strs) {
        if (strs.length == 0) {
            return "";
        } else if (strs.length == 1) {
            return strs[0];
        }
        String first = strs[0];
        for (String str : strs) {
            first = longestCommonPrefix(first, str);
            if ("".equals(first)) {
                break;
            }
        }
        return first;
    }

    private String longestCommonPrefix(String first, String second) {
        if (first.length() == 0 || second.length() == 0) {
            return "";
        } else if (first.equals(second)) {
            return first;
        }
        int length = first.length() > second.length() ? second.length() : first.length();
        int max = length;
        for (int i = 0; i < length; i++) {
            if (first.charAt(i) != second.charAt(i)) {
                max = i;
                break;
            }
        }
        System.out.println("longestCommon is [" + first.substring(0, max) + "] between [" + first +  "] and [" + second + "]");
        return first.substring(0, max);
    }
}
