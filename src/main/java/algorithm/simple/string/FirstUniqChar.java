package algorithm.simple.string;

/**
 *
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 注意事项：您可以假定该字符串只包含小写字母。
 *
 * Created by shionari on 2018/5/15
 */
public class FirstUniqChar {
    public int solution(String s) {
        if (s == null || s.length() == 0) {
            return -1;
        }
        int[] chars = new int['z' - 'a' + 1];
        char[] arr = s.toCharArray();
        for (char c : arr) {
            chars[c - 'a']++;
        }
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            if (chars[arr[i] - 'a'] == 1) {
                result = i;
                break;
            }
        }
        return result;
    }
}
