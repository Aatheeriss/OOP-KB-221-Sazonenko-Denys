import java.util.Scanner;

public class task_8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int sumOfNumbers = 0;

        while(true){
            int num = scanner.nextInt();
            if (num == 0){
                break;
            }
            else{
                i++;
                sumOfNumbers = sumOfNumbers + num;
            }
        }
        float medium = (float) sumOfNumbers /i;
        System.out.println("Medium value: " + medium);
    }
}
