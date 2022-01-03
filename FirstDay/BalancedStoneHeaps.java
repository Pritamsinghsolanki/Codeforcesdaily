import java.util.*;

public class BalancedStoneHeaps {

    public static boolean check(int n, int x, int[] h) {
        int[] c_h = new int[n];
        for (int i = 0; i < n; i++)
            c_h[i] = h[i];
        for (int i = n - 1; i >= 2; i--) {
            if (c_h[i] < x)
                return false;
            int d = Math.min(h[i], c_h[i] - x) / 3;
            c_h[i - 1] += d;
            c_h[i - 2] += 2 * d;
        }
        return c_h[0] >= x && c_h[1] >= x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] h = new int[n];
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                h[i] = sc.nextInt();
                if (h[i] > max) {
                    max = h[i];
                }
            }
            int l = 0;
            int r = max;
            while (l < r) {
                int mid = l + (r - l + 1) / 2;
                if (check(n, mid, h)) {
                    l = mid;
                } else {
                    r = mid - 1;
                }
            }
            System.out.println(l);
        }
    }
}