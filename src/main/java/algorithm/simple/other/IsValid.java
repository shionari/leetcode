package algorithm.simple.other;

import java.util.Stack;

/**
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * Created by shionari on 2018/5/23
 */
public class IsValid {
    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            switch(c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.size() == 0) {
                        return false;
                    } else {
                        char left = stack.pop();
                        if (c == ')' && left != '(') {
                            return false;
                        } else if (c == '}' && left != '{') {
                            return false;
                        } else if (c == ']' && left != '[') {
                            return false;
                        }
                    }
                    break;
            }
        }
        return stack.size() == 0;
    }
}
