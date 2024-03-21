import java.util.Scanner;
public class task_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a: ");
        double a = scanner.nextInt();

        System.out.println("Enter b: ");
        double b = scanner.nextInt();

        System.out.println("Enter c: ");
        double c = scanner.nextInt();

        double discriminant = calculateDiscriminant(a, b, c);

        //roots calculation
        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots: " + root1 + ", " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Root: " + root);
        } else {
            System.out.println("Equation has no roots.");
        }
    }

    //discriminant calculation function
    public static double calculateDiscriminant(double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}


