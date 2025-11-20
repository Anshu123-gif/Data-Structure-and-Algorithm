public class arrayTraversal {
    public static void print (int i , int []arr){
        if (i==arr.length ) return ;
        System.out.println(arr[i]+" ");
        print (i+1,arr);
    }
    public static void main(String[] args) {
        int [] arr = {2,3,45,56,6,4,5};
        print (0,arr);
    }
}
