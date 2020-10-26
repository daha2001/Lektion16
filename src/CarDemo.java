import java.util.Scanner;

public class CarDemo {
    public static void main(String[] args) {
        //skapa några objekt (instanser)

        // 1. skapa en referensvariabel
        Car car1;
        // 2. skapa objektet (minnesutrymme) med nycelordet new
        car1 = new Car();

        // skriv ut en referensvaribel
        System.out.println(car1); // Car@5f184fc6

        // steg 1 och 2 i samma sats
        Car car2 = new Car();
        System.out.println(car2); // Car@3feba861


        // arbeta med instansvariabler (egenskaper/properties)
        car1.model = "volvo";
        car1.year = 2020;
        car1.price = 350_000;

        car2.model = "saab";
        car2.price = 250_000;

        System.out.println(car1.model + " kostar " + car1.price + "kr");  // car1 med fulare utskrift
        System.out.printf("%s kostar %,d kr \n", car1.model, car1.price); // car1 utskrift med formatering
        System.out.printf("%s kostar %,d kr \n", car2.model, car2.price); // car2 utskrift med formatering


    }
}
