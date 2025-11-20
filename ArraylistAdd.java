package ARRAY;

import java.util.ArrayList;

public class ArraylistAdd {
    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
    System.out.println(List+" "+List.size());
    List.add(60);
    System.out.println(List+" "+List.size());
    List.add(40);
    System.out.println(List+" "+List.size());
    List.remove(0);
    System.out.println(List+" "+List.size());
    }
    
}
