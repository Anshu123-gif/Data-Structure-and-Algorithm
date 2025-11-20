

import java.util.Scanner;

public class Takinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int [][] arr = new int [2][3] ;
        
        int m = arr.length ;
        int n =arr[0].length  ;

        System.out.println(n) ;
        //taking input
        for (int i = 0 ;i < m ;i++){
            for (int j= 0 ;j < n ;j++){
                arr [i][j] = sc.nextInt()  ;
            }
        }
                // taking output 
                for (int i =0 ; i<m ;i++){
                    for (int j= 0 ;j<n; j++){
                       System.out.print(arr[i][j]+" ");


                }
                System.out.println();

            }


        } 
    }


    
    

