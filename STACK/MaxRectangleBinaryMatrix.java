import java.util.*;

public class MaxRectangleBinaryMatrix {

    // NSL: Nearest Smaller to Left
    static int[] NSL(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int left[] = new int[n];

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            left[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return left;
    }

    // NSR: Nearest Smaller to Right
    static int[] NSR(int[] arr) {
        Stack<Integer> st = new Stack<>();
        int n = arr.length;
        int right[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();

            right[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return right;
    }

    // Maximum Area Histogram
    static int MAH(int[] heights) {
        int left[] = NSL(heights);
        int right[] = NSR(heights);
        int max = 0;

        for (int i = 0; i < heights.length; i++) {
            int width = right[i] - left[i] - 1;
            int area = width * heights[i];
            max = Math.max(max, area);
        }
        return max;
    }

    // Main function
    public static int maxRectangle(int[][] matrix) {

        int n = matrix.length;
        int m = matrix[0].length;

        int heights[] = new int[m];
        int maxArea = 0;

        for (int i = 0; i < n; i++) {

            // update histogram
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0)
                    heights[j] = 0;
                else
                    heights[j] += 1;
            }

            // apply MAH
            int area = MAH(heights);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 1, 1},
            {1, 1, 1, 1},
            {1, 1, 1, 0}
        };

        System.out.println(maxRectangle(matrix)); // output: 6
    }
}
