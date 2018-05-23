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
        boolean isPrime[] = new boolean[n];
        for (int i = 0; i < n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (!isPrime[i]) continue;
            for (int j = 2; j * i < n; j++) {
                isPrime[i * j] = false;
            }
        }

        int ans = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) ans++;
        }
        return ans;
    }
}
