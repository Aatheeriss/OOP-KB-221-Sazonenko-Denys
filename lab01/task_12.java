import java.util.Arrays;
public class task_12 {
    public static void main(String[] args) {
        int[] array = {1, -1, 0, 4, 6, 10, 15, 25};
        boolean[] result = getSumCheckArray(array);
        System.out.println("Result: " + Arrays.toString(result));
    }
    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] result = new boolean[array.length];

        result[0] = false;
        result[1] = false;

        for (int i = 2; i < array.length; i++) {
            result[i] = array[i] == array[i - 1] + array[i - 2];
        }
        return result;
    }
}