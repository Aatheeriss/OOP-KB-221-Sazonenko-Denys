import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) throws Exception {

        System.out.println("Enter time in seconds");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        if(time < 0 || time > 86399){
            throw new Exception("Wrong amount of seconds");
        }

        int hours = time/3600;
        int minutes = (time%3600)/60;
        int seconds = time%60;

        System.out.printf("[%02d:%02d:%02d]", hours, minutes, seconds);
    }
}
