package gsdfsf;

public class sortzeroonetwo {
    public static void main(String[] args) {
        int [] arr = {0,1,0,1,0,0,2,0,1,2};

        int n = arr.length;

        int mid = 0, hi = n - 1, lo = 0;

        while (mid <= hi) {
            if (arr[mid] == 0) {
                int temp = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = temp;
                lo++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                int temp = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = temp;
                hi--;
            }
        }

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
