import java.util.*;

public class B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int[] arr = new int[2];
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '1') {
                    arr[1]++;
                } else {
                    arr[0]++;
                }
            }
            ArrayList<Integer> ans = new ArrayList<>();
            int zeros = 0;
            int zeroe = arr[0] - 1;
            int ones = arr[0];
            int onee = n - 1;
            // System.out.println(arr[0] + " " + arr[1] + " " + zeros + " " + zeroe + " " +
            /// ones + " " + onee);
            while (zeros <= zeroe) {
                if (s.charAt(zeros) != '0') {
                    ans.add(zeros + 1);
                    // prints(zeros + " " + s.charAt(zeros));
                    // println();
                }

                zeros++;
            }
            while (ones <= onee) {
                if (s.charAt(ones) != '1') {
                    ans.add(ones + 1);
                }
                ones++;
            }

            if (ans.size() == 0)
                System.out.print(0);
            if (ans.size() != 0) {
                System.out.println(1);
                System.out.print(ans.size() + " ");
                for (int i = 0; i < ans.size(); i++) {
                    System.out.print(ans.get(i) + " ");
                }
            }
            System.out.println();
        }
    }
}
