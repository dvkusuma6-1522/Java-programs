//5.  Count the Digits That Divide a Number — Given an integer num, count how many of its digits are non-zero and divide num evenly. 
import java.util.*;
public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = n;
       int count = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit != 0 && num % digit == 0) {
                count++;
            }
            n /= 10;
        }
        System.out.println(count);
    }
}
