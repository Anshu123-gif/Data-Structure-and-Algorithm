public class Targetelement {
    public static void main(String[] args) {
        int [] arr ={23,423,45,34,43,54};
        int n = arr.length;

        int target = 34;

        int lo = 0 ; int hi = n-1;
        boolean flag = false ;
        while ( lo<=hi) {
            int mid =(lo+hi)/2 ;
            if (arr[mid]==target){
                flag  = true ; break ;

            }
            else if (arr[mid]>target) hi = mid-1;
            else if (arr[mid]<target) lo =mid+1 ;
            
        }
        if (flag == true) System.out.println("Target element found");
        else System.out.println("Target not found ");
    }
    
}
