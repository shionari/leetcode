package algorithm.simple.string;

/**
 * Created by shionari on 2018/5/13
 */
public class ReverseString {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return sb.toString();
    }
}
