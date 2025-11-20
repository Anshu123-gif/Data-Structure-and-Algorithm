
package OOPS;
public class UserDefinedDatatype {
    static class Student {
        int roll;
        String name;
    }
	public static void main(String[] args) {
        Student s1 = new Student ();
       
        s1.roll = 21;
        s1.name = "anshu";
        System.out.print(s1.roll+" "+s1.name);
    }
}