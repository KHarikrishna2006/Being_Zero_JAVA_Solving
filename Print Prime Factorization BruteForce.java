public class BruteForcePrimeFactors {
    public static void printBruteForce(long n) {

        for (long i = 2; i <= n; i++) {

            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }

        }
    }
