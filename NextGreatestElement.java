package ARRAY;

public class NextGreatestElement {
    public static void main(String[] args) {
        int []arr={2,8,41,60,2,49,16,28,21};
        int n =arr.length ;
        int []ans = new int [n] ;
        ans [n-1] = -1 ;

        //optimised method 
        int nge = arr[n-1] ;
        for (int i=n-2; i>=0 ; i--){
            ans [i] =nge ;
            nge = Math.max(nge ,arr[i]);

        }

        for (int ele : arr){
         System.out.print (ele+" ");

        }
        System.out.println();

        for (int ele: ans ){
            System.out.print(ele+ " ");

        }

        System.out.println();

        
    
    
}
    }