package ARRAY;

import java.util.Arrays;

public class copyofarray {
    public static void main (String []args){
        int []arr = {10,20,30,40,50,60,70};
        for (int ele :arr){
            System.out.print(ele+" ");
            
        }
        System.out.println();
        //int [] num = arr ;//shallow copy 
        //num [0] = 60 ;
         //System.out.println (arr[0]);
       int [] brr = Arrays.copyOf(arr,arr.length); //deep copy 
       brr[0] = 99;
       System.out.print(arr[0]);
    }
    
}
