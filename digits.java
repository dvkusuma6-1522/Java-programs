//8.   Count Digits That Divide a Number — This is the digit-divisibility problem listed separately in your document; count the digits of the number that divide the original number without remainder. 
import java.util.*;
public class digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && original % digit == 0) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }}
