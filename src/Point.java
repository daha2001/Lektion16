public class Point {
    // Point är en klass som beskriver en punkt i 2D-koordinatsystem

    // instansvariabler
    double x; // x-koordinat
    double y; // y-koordinat


    /**
     * en klassmetod som beräknar avståndet mellan två punkter
     *
     * @param p1 är en referensvariabel till den första punkten
     * @param p2 är en referensvariabel till den andra punkten
     * @return avståndet mellan punkterna
     */
    public static double distance(Point p1, Point p2) {

        //beräkna avståndet
        return Math.sqrt(Math.pow(p2.x - p1.x, 2) + (p2.y - p1.y) * (p2.y - p1.y));
    }

    /**
     * en klassmetod som beräknar mittpunkten
     *
     * @param p1 är en referens till den första punkten
     * @param p2 är en referens till den andra punkten
     * @return en referens till mittpunkten
     */
    public static Point midPoint(Point p1, Point p2) {

        Point p3 = new Point();
        p3.x = (p1.x + p2.x) / 2;
        p3.y = (p1.x + p2.x) / 2;

        return p3;

    }

}
