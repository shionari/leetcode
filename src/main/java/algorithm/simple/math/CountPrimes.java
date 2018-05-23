package algorithm.simple.math;

/**
 * Created by shionari on 2018/5/22
 */
public class CountPrimes {

    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
        System.out.println(countPrimes.countPrimes(0));
    }

    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            boolean isPrimes = true;
            for (int j = 2; j <= i; j++) {
                if (i != j && i % j != 0) {
                    isPrimes = false;
                    break;
                }
            }
            if (isPrimes) {
                count++;
            }
        }
        return count;
    }
}
