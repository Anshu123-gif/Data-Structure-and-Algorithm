public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = { {2, 3, 3}, {3, 4, 5} };

        int m = arr.length;       // rows = 2
        int n = arr[0].length;    // columns = 3

        // Transpose: Print columns as rows
        for (int j = 0; j < n; j++) {         // loop through columns
            for (int i = 0; i < m; i++) {     // loop through rows
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();  // new line after each transposed row
        }
    }
}