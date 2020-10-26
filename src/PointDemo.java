public class PointDemo {
    public static void main(String[] args) {

        // skapa några punkter
        Point p1 = new Point();
        Point p2 = new Point();

        // skriv ut referensvariabler, inte värdet
        System.out.println("p1 = " + p1); // Point@10f87f48
        System.out.println("p2 = " + p2); // Point@b4c966a

        // skriv ut punkterna
        System.out.println("p1: (" + p1.x + " , " + p1.y + ")");
        System.out.println("p2: (" + p2.x + " , " + p2.y + ")");

        // flytta punkt 1 (p1)
        p1.x = 5;  // flyttar x 5 steg till höger
        p1.y = -5; // flyttar y 5 steg neråt

        // flytta punkt 2 (p2)
        //p2.x = 10.5;
        //p2.y = -5.5;

        System.out.println("p1: (" + p1.x + " , " + p1.y + ")");
        System.out.println("p2: (" + p2.x + " , " + p2.y + ")");

        //beräkna avståndet mellan p1 och p2
        double d = Point.distance(p1, p2);
        System.out.printf("avstånd = %.2f", d);

        // flytta punkt 1
        p1.x = 10;
        p1.y = 0;
        System.out.printf("\navstånd = %.2f", Point.distance(p1, p2));


        // beräkna mittpunkten
        Point midpoint = Point.midPoint(p1, p2);
        System.out.println();
        System.out.println("mittpunkten är " + midpoint.x + ", " + midpoint.y);

    }

}
