public class Equals {
    public static void main(String[] args) {
        
        String s = "asdf";
        String a = "asdf";

        String b = new String (s);

        String c = "as";

        c = c + "df" ;

        System.out.println(s==c);

        System.out.println(s.equals(c));

    }
    
}
