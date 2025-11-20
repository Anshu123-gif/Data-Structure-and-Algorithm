public class prac {
    if (matrix.length==0) return 0 ;

    int n = matrix.length ; //row 
    int m = matrix[0].length ; //coloumn 

    int [] height = new int [m];
    int maxArea = 0 ;

    for(int i = 0 ; i<n ; i++ ){
        for (int j =0 ; j< m ; j++){
            if (matrix[i][j]=='1')
            [height][j] += 1 ;
            else 
            height[j] = 0 ;
        }
        maxArea = Math.max(maxArea, MAH(height));

    }
    return  maxArea ;
}
private int MAH (int[] height){
    int[] left = NSL (height);
    int[] right = NSR (height);
    int max = 0 ;

    for (int i =0 ; i< height.length ; i++){
        int width = right [i] - left[i] -1 ;
        int area = width*height[i];
        max = Math.max(max, area);
    }
    retur max ; 
}
private int [] NSL (int [] arr){
    Stack <Integer> st = new stack<> () ;
    int [] left = new int [arr.length];

 }