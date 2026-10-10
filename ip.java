//19. Defanging an IP Address — Given a valid IPv4 address, replace every . with [.] and return the resulting string
import java.util.*;
public class ip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String address = sc.nextLine();
        System.out.println(address.replace(".", "[.]"));
    }
}
