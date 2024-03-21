import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) throws Exception{

        System.out.println("Enter amount of strangers: ");

        Scanner scanner = new Scanner(System.in);
        int amountOfStrangers = scanner.nextInt();
        scanner.nextLine();

        if(amountOfStrangers <= 0){
            throw new Exception("Wrong amount of strangers");
        }

        String[] names = new String[amountOfStrangers];

        System.out.println("Enter " + amountOfStrangers + " names: ");
        for(int i=0; i<amountOfStrangers; i++){
            String name = scanner.nextLine();
            names[i] = name;
        }

        for (String name : names) {
            System.out.println("Hello, " + name);
        }
    }
}