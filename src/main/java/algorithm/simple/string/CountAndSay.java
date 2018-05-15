package algorithm.simple.string;

/**
 * Created by shionari on 2018/5/15
 */
public class CountAndSay {



    public String solution(int n) {
        String result = "1";
        int min = 1;
        if (n < 0) {
            return "";
        } else if (n == 1) {
            return result;
        }
        int start = 2;
        while (start <= n) {
            char[] chars = result.toCharArray();
            int count = 1;
            char ch = chars[0];
            StringBuilder sb = new StringBuilder();
            for (char c : chars) {
                if (c == ch) {
                    count++;
                } else {
                    sb.append(count).append(ch);
                    ch = c;
                    count = 1;
                }
            }
            sb.append(count).append(ch);
            result = sb.toString();
            start++;
        }
        return result;
    }
}
