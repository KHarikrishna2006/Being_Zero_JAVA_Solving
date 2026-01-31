public class OptimalPrimeFactorization {

    public static void printOptimalPrimeFactors(long n) {

        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 1) {
            System.out.print(n);
        }
    }
}
