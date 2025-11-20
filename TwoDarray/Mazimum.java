

public class Mazimum {
    public static void main(String[] args) { 
        int [][] arr = {{12,55,55},{44,85,42},{47,65,88}};

        int mx = Integer.MIN_VALUE;

        int m = arr.length ;
        int n = arr[0].length ;

        for (int i =0 ; i<m ;i++){
            for (int j =0 ;j<n ;j++){
                mx = Math.max(mx,arr[i][j]);

            }
        }

        System.out.print("maximum element is   "+mx);
         



        
    }
    
}
