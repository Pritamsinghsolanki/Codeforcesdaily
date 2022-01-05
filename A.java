import java.util.*;

public class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if (m == 1) {
                System.out.println(1);
            } else if (n % 2 == 0) {
                System.out.println(n);
            } else if (n % 2 == 1) {
                System.out.println(n - 1);
            } else {
                System.out.println(0);
            }
        }

    }
}