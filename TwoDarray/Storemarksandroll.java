

import java.util.Scanner;

public class Storemarksandroll {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

         int [][] arr = new  int [4][2] ;

         int m =arr.length ; 
         int n = arr[0].length ;

         System.out.println();
         for (int i = 0 ;i < m ;i++){
            for (int j= 0 ;j < n ;j++){
                arr [i][j] = sc.nextInt()  ;
            }
        }
                // taking output 
                for (int i =0 ; i<4 ;i++){
                    for (int j= 0 ;j<2; j++){
                       System.out.println(arr[i][j]+" ");


         

        
    }
    
}
System.out.println();
    }
}
