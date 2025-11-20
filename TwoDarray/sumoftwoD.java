

public class sumoftwoD {
    public static void main(String[] args) {
        
        int arr[][] = {{4,5,5},{5,8,9},{5,9,7}};
        int m =arr.length ;
        int n = arr[0].length ;
        
        int sum = 0 ;

        for (int i =0 ;i<m ;i++){
            for (int j=0 ;j<n ;j++){

                sum += arr[i][j]; 
            }

        }
       
        System.out.print("sum is "+sum);
        
    }
    
}
