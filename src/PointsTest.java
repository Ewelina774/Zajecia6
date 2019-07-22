import java.util.Scanner;

class PointsTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj X");
        int a = scanner.nextInt();

        System.out.println("Podaj Y");
        int b = scanner.nextInt();


        Points points = new Points();
        Point point = new Point();
        Point.a = a;
        Point.b = b;
        System.out.println("Punkt (" + a + ", " + b + ") leży " + points.quarter(a, b) + " układu współrzędych");

    }
}

