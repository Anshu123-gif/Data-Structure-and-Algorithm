public class subsetString {
    public static void subset(String s, String ans, int i) {
        if (i == s.length()) {
            System.out.println(ans);
            return;
        }
        // Choice 1: include current character
        subset(s, ans + s.charAt(i), i + 1);
        // Choice 2: exclude current character
        subset(s, ans, i + 1);
    }
    public static void main(String[] args) {
        String s = "abc";
        subset(s, "", 0);
    }
}
