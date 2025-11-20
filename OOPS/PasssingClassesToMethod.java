public class PasssingClassesToMethod {
    public static class Car {
       int seat ; 
       String name ;
      double length ;
      String type ;
      int torque ;
        
    }
    public static void main(String[] args) {
        Car c = new Car();
        c.length = 3.44 ;
        c.name = "kia sonet ";
        c.seat = 5 ;
        c.torque = 234;
        c.type = "SUV";

        change (c);
        System.out.println(c.seat);
    }
    private static void change (Car c ){  // agar hm object ko function me bje h to wo passs by refeence hoti hai
        c.seat = 4 ;
    }

}
