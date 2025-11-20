package ARRAY;

public class reversearr {
    public static void main(String[] args) {
        int [] arr = { 10,20,30,40,50,50,60};
        for (int ele : arr  ){
            System.out.print  (ele +" ");
        }
        System.out.println ();
      int n =arr.length ;
        int i = 0 , j =n-1 ; 
        while (i<=j){
              swap   (arr,i,j);
             i++ ;
             j-- ;
        }
        for (int ele : arr  ){
            System.out.print  (ele +" ");

        }
        System.out.println  ();
        
    }
    public static void swap(int[]arr,int i ,int j ) {
        int temp = arr [i] ;
        arr [i] = arr [j];
        arr[j] = temp ;
         }
    
}
