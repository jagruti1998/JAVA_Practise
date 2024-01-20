package basics;

public class primeFactors {
    public static void main(String[] args) {
        int n = 57;
        printPrimeFactors(n);
    }

    public static void printPrimeFactors(int n) {
        // Print 2 as a factor repeatedly
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }

        // At this point, n must be an odd number
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        // If n is a prime number greater than 2
        if (n > 2) {
            System.out.print(n);
        }
    }
}
