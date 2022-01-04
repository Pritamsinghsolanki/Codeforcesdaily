import java.util.*;

public class A {

    static void print(int n) {
        System.out.println(n);
    }

    static void printar(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static void println() {
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = Math.abs(a + c - 2 * b);
            if (d % 3 == 0) {
                print(0);
            } else {
                print(1);
            }
        }
    }
}