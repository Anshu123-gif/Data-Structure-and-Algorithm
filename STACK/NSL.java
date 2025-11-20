import java.util.*;

public class NSL {
    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int n = arr.length;
        int[] result = new int[n];

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {

            // pop all greater or equal elements
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            // answer
            result[i] = st.isEmpty() ? -1 : st.peek();

            // push current element
            st.push(arr[i]);
        }

        System.out.println(Arrays.toString(result));
    }
}