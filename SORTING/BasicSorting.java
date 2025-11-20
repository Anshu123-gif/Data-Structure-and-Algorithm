public class BasicSorting {
    public static void main(String[] args) {
        int [] arr = {14,15,16,17};
        boolean flag = true ;
        int n = arr.length ;
        for(int i =0 ;i<n-1 ;i++){
            if (arr[i]>arr[i+1]){
                flag = false ;
                break ;

            }
        }
        if(flag == true ) System.out.println("sorted");
        else System.out.println("unsorted");
    }
}
