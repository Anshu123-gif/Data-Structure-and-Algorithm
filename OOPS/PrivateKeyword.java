
public class PrivateKeyword {

    // Inner class Students
    static class Students {
        private int rno; // private variable
        private int no;  // private variable
        public double cgpa; // public variable

        // Getter method for rno
        public int getRno() {
            System.out.println("cgpa: " + cgpa + " rno: " + rno);
            return rno;
        }

        // Setter method for rno
        public void setRno(int x) {
            rno = x;
        }
    }

    public static void main(String[] args) {
        Students s1 = new Students();
        s1.cgpa = 9.8;
        // s1.rno = 45; // ❌ Error: rno is private
        s1.setRno(45); // ✅ Correct way to set rno
        System.out.println(s1.getRno()); // ✅ Accessing rno via getter
    }
}


