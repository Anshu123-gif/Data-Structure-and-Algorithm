public class Merge_sort {
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


    public static void mergesort(int[]arr){
        int n = arr.length ;
        if (n==1) return; //base case 
        // creating two arrays of n/2 size each 
        int [] a = new int [n/2];
        int [] b = new int[n-n/2];
        //copying 3
         for(int i =0 ;i<n/2 ;i++){
            a[i] = arr [i] ;
         }
         for (int i=0 ;i<n-n/2 ; i++){
            b[i] = arr[i+n/2];
         }
         //magic 
         mergesort(a);
         mergesort(b);
         //merge these a and b 
   merge (a,b,arr);

    }
    public static void main(String[] args) {
        int [] arr = {80,30,50,20,60,10,70,40};
        print (arr);
        System.out.println("sorted array");
        mergesort(arr);
        print(arr) ;
    }
}
