import java.util.Scanner;
public class FrequencyArray {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();

        int [] freq = new int [26];

        // Count each letter
        for (int i=0 ;i<s.length();i++){
            char ch =s.charAt(i);
            int idx = (int)ch -97 ;
            freq[idx] ++ ;
        }

       //  Find the biggest number
        int maxFreq =-1 ;
        for (int i=0 ;i<freq.length ;i++){
            maxFreq = Math.max(maxFreq,freq[i]);
            
        }

        // Print letters with max frequency
        for (int i=0 ;i<freq.length ; i++){
            if (freq[i]==maxFreq){
                char ch = (char)(i+97);
                System.out.println(ch+" ");
            }
        }


    }
    
}
