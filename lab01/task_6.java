import java.util.Scanner;

public class task_6 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sum = scanner.nextInt();
        int amountOfFriends = scanner.nextInt();

        if(sum<=0 || amountOfFriends <= 0){
            throw new Exception("Wrong data");
        }
        else {
            int tenPercent = (sum/amountOfFriends)/10;
            int result = sum/amountOfFriends + tenPercent;
            System.out.println("Result: " + result);
        }
    }
}
