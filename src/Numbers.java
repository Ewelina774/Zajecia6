import java.util.Scanner;

class Numbers {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę");
        numbers[0] = scanner.nextInt();
        System.out.println("Podaj drugą liczbę");
        numbers[1] = scanner.nextInt();
        System.out.println("Podaj trzecią liczbę");
        numbers[2] = scanner.nextInt();
        System.out.println("Podaj czwartą liczbę");
        numbers[3] = scanner.nextInt();
        System.out.println("Podaj piątą liczbę");
        numbers[4] = scanner.nextInt();


        int sum = numbers[0] + numbers[2] + numbers[4];
        System.out.println("Suma liczby pierwszej, trzeciej i piątej to " + String.valueOf(sum));
    }
}