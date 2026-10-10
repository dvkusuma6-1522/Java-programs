
public class PrimeNumbers {
    public static void main(String[] args) {
        int start = 10;
        int end = 50;
        int count = 0;

        System.out.println("Prime numbers:");

        for (int num = start; num <= end; num++) {
            boolean isPrime = true;

            if (num < 2) {
                isPrime = false;
            }

            for (int i = 2; i <= num / i; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Count: " + count);
    }
}
