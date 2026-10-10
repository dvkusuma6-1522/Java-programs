//6.   Number of Steps to Reduce a Number to Zero — Starting with a non-negative integer num, repeatedly divide it by 2 when it is even, or subtract 1 when it is odd. Return the number of steps required to reach zero. 
import java.util.*;
public class zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int steps = 0;
        while (n != 0) 
 if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
            }
            steps++;
        }
        System.out.println(steps);
    }
}
