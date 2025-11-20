import java.util.Scanner;

public class maxepath {
    public static int maze(int row, int col, int m, int n) {
        if (row == m || col == n)
            return 1;
        int rightways = maze(row, col + 1, m, n);
        int downways = maze(col, row + 1, m, n);
        return rightways + downways;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  ");
        int n = sc.nextInt();
        System.out.println("Enter b ");
        int m = sc.nextInt();
        System.out.println(maze(1, 1, m, n));

    }
}
