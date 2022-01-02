import java.util.*;

public class Berlandmusic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] arr = new int[n][3];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
            }
            String str = sc.next();
            for (int i = 0; i < n; i++) {
                arr[i][1] = str.charAt(i) == '1' ? 1 : 0;
                arr[i][2] = i;
            }
            Arrays.sort(arr, (a, b) -> a[0] - b[0]);
            int zero = 1;

            for (int i = 0; i < n; i++) {
                if (arr[i][1] == 0) {
                    arr[i][0] = zero;
                    zero++;
                }
            }

            int one = zero;
            for (int i = 0; i < n; i++) {
                if (arr[i][1] == 1) {
                    arr[i][0] = one;
                    one++;
                }
            }
            Arrays.sort(arr, (a, b) -> a[2] - b[2]);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][0] + " ");
            }
            System.out.println();
        }
    }
}