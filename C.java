import java.util.*;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            ArrayList<String> st = new ArrayList<>();
            st.add("aa");
            st.add("aba");
            st.add("aca");
            st.add("abca");
            st.add("acba");
            st.add("abbacca");
            st.add("accabba");

            int ans = -1;
            for (int i = 0; i < 7; i++) {
                if (s.contains(st.get(i))) {
                    ans = st.get(i).length();
                    break;
                }
            }
            System.out.println(ans);
        }
    }
}
