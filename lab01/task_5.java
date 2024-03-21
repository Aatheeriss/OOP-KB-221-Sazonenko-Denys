import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if (a >= h) {
            System.out.println(1);
        } else if (a <= b) {
            System.out.println("Impossible");
        } else {
            int days = (h - b - 1) / (a - b) + 1;
            System.out.println(days);
        }
    }
}