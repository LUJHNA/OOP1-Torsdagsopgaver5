package Task1;

public class Main {
    public static void main(String[] args) {

        Driver d1 = new Driver("Jakob", 27);
        Car c1 = new Car("BMW", "M3", 2012, "Sedan");
        Car c2 = new Car("Ford", "Mustang", 2014, "Coupe");


        System.out.println(c1.toString() + d1.toString());
        System.out.println(c2.toString() + d1.toString());
    }
}
