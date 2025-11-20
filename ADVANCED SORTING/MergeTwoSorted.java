public class MergeTwoSorted {
    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    // merge two sorted arrays a and b into c (c must have length a.length + b.length)
    public static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        // merge while both arrays have elements
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // copy remaining from a (if any)
        while (i < a.length) {
            c[k++] = a[i++];
        }

        // copy remaining from b (if any)
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }

    public static void main(String[] args) {
        int[] a = {10, 30, 50, 60, 80, 90};
        int[] b = {21, 42, 72, 78};
        System.out.print("A: ");
        print(a);
        System.out.print("B: ");
        print(b);

        int[] c = new int[a.length + b.length];
        merge(a, b, c);

        System.out.print("Merged: ");
        print(c);
    }
}
