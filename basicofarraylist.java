package ARRAY;

import java.util.ArrayList;

public class basicofarraylist {
    public static void main(String[] args) {
        ArrayList<Integer>arr = new ArrayList<>(6);
        arr.add(0,10);
        arr.add (1,20);
        arr.add (1,30);
        arr.add (1,40);
        arr.add (1,50);
        arr.add (1,60);
        System.out.println (arr);
        arr.set(2,300);// modify 
        System.out.println(arr); //get to print 
        arr.add (90);
        System.out.print (arr);
        


    }
    }
    

    

