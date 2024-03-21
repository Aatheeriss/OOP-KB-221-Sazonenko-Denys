public class task_11 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Sum: " + sum(array));
    }
    public static int sum(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum = sum + num;
            }
        }
        return sum;
    }
}