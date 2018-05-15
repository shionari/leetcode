package algorithm.simple.string;

/**
 * Created by shionari on 2018/5/15
 */
public class StrStr {
    public int strStr(String haystack, String needle) {
        if (needle == null || needle.length() == 0) {
            return 0;
        } else if (haystack == null || haystack.length() == 0) {
            return -1;
        } else if (haystack.length() < needle.length()) {
            return -1;
        }
        char[] ch = haystack.toCharArray();
        char[] cn = needle.toCharArray();
        int result = -1;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == cn[0]) {
                boolean isStr = true;
                for (int j = 0; j < cn.length; j++) {
                    if (i + j >= ch.length || cn[j] != ch[i + j]) {
                        isStr = false;
                        break;
                    }
                }
                if (isStr) {
                    result = i;
                    break;
                }
            }
        }
        return result;
    }
}
