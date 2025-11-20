import java.util.Arrays;

public class BuitInSorting {
    public static void main(String[] args) {
         int []arr  = {1,2,9,4,5};
         for (int ele : arr){
            System.out.print(ele+" ");
         }
         System.out.println();
         
         Arrays.sort(arr);
         for (int ele : arr){
            System.out.print(ele+" ");
         }
    }
}
