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

    }
}
