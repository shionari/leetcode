package algorithm.simple.math;

/**
 * Created by shionari on 2018/5/23
 */
public class IsPowerOfThree {

    public static void main(String[] args) {
        IsPowerOfThree isPowerOfThree = new IsPowerOfThree();
        System.out.println(isPowerOfThree.isPowerOfThree(81));
    }

    public boolean isPowerOfThree(int n) {
        System.out.println("check " + n);
        if (n == 1) {
            return true;
        } else if (n < 3 || n % 3 != 0) {
            return false;
        }
        return isPowerOfThree(n / 3);
    }
}
