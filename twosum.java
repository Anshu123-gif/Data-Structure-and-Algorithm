package ARRAY;

public class twosum {
    public static void main(String[] args) {
        int [] arr = {10,3,4,3,6,6};
        //int n = arr.length;
        int x = 7 ;
        for (int i =0 ;i<=5 ;i++){
            for (int j =i+1; j<=5 ;j++){
                if (arr [i] +arr[j] ==x ){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }

    }
    
}
