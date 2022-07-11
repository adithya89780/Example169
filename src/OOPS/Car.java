package OOPS;

public class Car {
    static int wheels = 4;      // static variable or class variable > variable declared and initialization
    String color = "";          // instance variable or non-static variable  > variable declaration

    static void Break ()         //Static method declaration
    {
        System.out.println("Car stop when break is apply");
    }

    void Speed (int s)              // Instance method declaration
    {
        System.out.println("Car speed is "+s);
    }


    public static void main(String[] args) {

        //Creating Objects
        Car Audi = new Car();   // Reference variable
        Car Bmw = new Car();
        Car Tata = new Car();
        System.out.println(Audi.wheels);
        System.out.println(Bmw.wheels);
        System.out.println(Tata.wheels);

        //
        Audi.color = "Red";
        Bmw.color = "Black";
        Tata.color = "White";

        System.out.println(Audi.color);
        System.out.println(Bmw.color);
        System.out.println(Tata.color);

        // Method calling
        Audi.Break();
        Bmw.Break();
        Tata.Break();

        // Method calling
        Audi.Speed(250);
        Bmw.Speed(200);
        Tata.Speed(150);
    }
}
