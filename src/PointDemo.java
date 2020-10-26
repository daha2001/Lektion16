public class PointDemo {
    public static void main(String[] args) {

        // skapa några punkter
        Point p1 = new Point();
        Point p2 = new Point();

        System.out.println("p1 = " + p1); // Point@10f87f48
        System.out.println("p2 = " + p2); // Point@b4c966a

        // skriv ut punkterna
        System.out.println("p1: (" + p1.x + " , " + p1.y + ")" );
        System.out.println("p2: (" + p2.x + " , " + p2.y + ")" );

        // flytta punkt 1 (p1)
        p1.x = 5;  // flytta 5 steg till höger
        p1.y = -5; // flytta 5 steg neråt
    }0
}
