import java.util.Scanner;
public class reverseeachwordInsentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.nextLine());

        int n = sb.length();
        int i = 0, j = 0;  // using two pointer 

        while (j < n) {
            if (sb.charAt(j) != ' ')
                j++;
            else {
                reverse(sb, i, j - 1); // reverse current word
                i = j + 1;
                j = i;
            }
        }

        reverse(sb, i, j - 1); // reverse last word
        System.out.println(sb);
    }

    static void reverse(StringBuilder sb, int start, int end) {
        while (start < end) {
            char temp = sb.charAt(start);
            sb.setCharAt(start, sb.charAt(end));
            sb.setCharAt(end, temp);
            start++;
            end--;
        }
    }
}
