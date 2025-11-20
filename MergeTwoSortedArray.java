package ARRAY;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        int [] a = {11,33,42,71};
        int [] b = {26,54,69,82};
        int [] c = new int [a.length + b.length];

         int i =0 ; int j = 0 ; int k =0 ;
         //merging 

         while (i<a.length && j< b.length) {

            
            if (a[i]<=b[j] ){  
                c[k] = a[i];
                i++ ;

            

        } else{ 
                c[k] =b[j];
                j++;
            }
            k++ ;
        }

       
        // Copy remaining elements of a[]
        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }
       // Copy remaining elements of b[]
        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }


        
    
            
         
         for (int ele :c){
            System.out.print(ele+" ");
         }
    }
}
    

