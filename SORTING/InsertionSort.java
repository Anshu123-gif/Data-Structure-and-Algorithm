public class InsertionSort { 
     public static void print (int []arr) {

    for (int ele :arr ){
        System.out.print(ele+" ");
    }
    System.out.println();
}
  public static void main(String[] args) {
        int [] arr = {2,0,2,1,1,0};
        int n =arr.length ;
        print (arr);
        for (int i =1 ;i<n ;i++){
           
                int j =i ;
                while (j>=1  && arr[j]<arr[j-1] ) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] =temp ;
                    j--;
                }
  print (arr);
            }
        }
    }
    

