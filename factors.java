//7.   Find Common Factors — Given two positive integers a and b, determine how many positive integers divide both a and b. 
import java.util.*;
public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
     if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
