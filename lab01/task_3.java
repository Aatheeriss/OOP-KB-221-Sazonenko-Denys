import java.util.Scanner;

public class task_3 {
    final static int password = 12345;

    public static void main(String[] args){

        System.out.println("Enter your password: ");
        Scanner scanner = new Scanner(System.in);
        int enteredPass = scanner.nextInt();

        if(enteredPass == password){
            System.out.println("Hello, Agent!");
        }
        else {
            System.out.println("Access denied!");
        }
    }
}
