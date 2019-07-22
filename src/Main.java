import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę 1");
        double a = scanner.nextDouble();
        System.out.println("Podaj liczbę 2");
        double b = scanner.nextDouble();

        Calculator calculator1 = new Calculator();
        System.out.println("Wynik działania to: " + Calculator.calc(a, b));
    }
}
