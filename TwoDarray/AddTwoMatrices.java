
import java.util.Scanner ;
public class AddTwoMatrices {
    public static void main(String[] args) {
        int [][] a = {{1,5,5},{3,4,5},{4,6,2}};
        int [][] b = {{4,5,6},{7,4,3},{8,4,6}};

        int m =a.length ;
        int n = b[0].length ;
        int [][] res = new int [m][n];

        for (int i=0 ;i<m ;i++){
            for  (int j =0 ;j<n ;j++){
                res [i][j] = a[i][j] + b[i][j];
            }
        }

        for (int i=0 ;i<m ;i++){
            for (int j=0 ;j<n ;j++){
                System.out.print(res[i][j] +"  ");



            }
            System.out.println();
        }


        

        
    }
    
}
