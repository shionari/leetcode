package algorithm.simple.math;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 写一个程序，输出从 1 到 n 数字的字符串表示。
 *
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 *
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 *
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 *
 * Created by shionari on 2018/5/23
 */
public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            boolean isFizz = i % 3 == 0;
            boolean isBuzz = i % 5 == 0;
            String res;
            if (isFizz && isBuzz) {
                res = "FizzBuzz";
            } else if (isFizz) {
                res = "Fizz";
            } else if (isBuzz) {
                res = "Buzz";
            } else {
                res = "" + i;
            }
            list.add(res);
        }
        return list;
    }
}
