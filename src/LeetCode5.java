public class LeetCode5 {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("babad"));
        System.out.println(longestPalindrome("cbbd"));
        System.out.println(longestPalindrome("a"));
    }

    public static String longestPalindrome(String s) {

        int size = s.length();
        char c[] = new char[size];
        for (int i = 0; i < size; i++) {
            c[i] = s.charAt(i);
        }

        int count = -1;
        String res = "";
        for (int i = 0; i < size; i++) {
            int l = i;
            int r = i;
            while (l >= 0 && r < size && c[l] == c[r]) {
                if ((r - l) > count) {
                    res = s.substring(l, r + 1);
                    count = r - l;
                }
                l--;
                r++;
            }
            l = i;
            r = i + 1;
            while (l >= 0 && r < size && c[l] == c[r]) {
                if ((r - l) > count) {
                    res = s.substring(l, r + 1);
                    count = r - l;
                }
                l--;
                r++;
            }

        }
        return res;

    }
}
