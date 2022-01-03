import java.util.*;

public class Representativeedges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            int ans = n;

            if (n == 1 || n == 2) {
                System.out.println(0);
                continue;
            }
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    int count = 0;
                    for (int k = 0; k < n; k++) {
                        if ((arr[k] - arr[i]) * (k - j) != (arr[k] - arr[j]) * (k - i))
                            count++;
                    }
                    ans = Math.min(ans, count);
                }
            }
            System.out.println(ans);
        }
    }
}
