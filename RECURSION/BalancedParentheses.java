public class BalancedParentheses {

    // Recursive function
    public static void printParentheses(int open, int close, int n, String s) {
        // Base case → jab string complete ho jaye
        if (s.length() == 2 * n) {
            System.out.println(s);
            return;
        }

        // "(" lagane ki condition
        if (open < n) {
            printParentheses(open + 1, close, n, s + "(");
        }

        // ")" lagane ki condition
        if (close < open) {
            printParentheses(open, close + 1, n, s + ")");
        }
    }

    public static void main(String[] args) {
        int n = 3;  // number of pairs
        printParentheses(0, 0, n, "");
    }
}
