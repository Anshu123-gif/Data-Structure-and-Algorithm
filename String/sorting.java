import java.util.Arrays;

public class sorting {
    public static void main(String[] args) {
        
        String s = "anshu";
        char [] ch = s.toCharArray();
        Arrays.sort (ch);
        for (char ele : ch){
            System.out.print(ele); //ahnsu
        }
        System.out.println();
    }
}
