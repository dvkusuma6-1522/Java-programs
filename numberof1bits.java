//4. Number of 1 Bits — Given a positive integer n, return the number of 1 bits in its binary representation, also called its Hamming weight.
import java.util.*;
public class numberof1bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            count += n % 2;
            n /= 2;
        }
        System.out.println(count);
    }
}
