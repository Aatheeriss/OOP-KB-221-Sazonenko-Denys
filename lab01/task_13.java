import java.util.Arrays;
public class task_13 {
    public static void main(String[] args) {
        int[] array = {18, 1, 3, 6, 7, -5};
        int[] result = removeLocalMaxima(array);
        System.out.println("Result: " + Arrays.toString(result));
    }
    public static int[] removeLocalMaxima(int[] array) {
        int[] result = Arrays.copyOf(array, array.length); //array copy

        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
                result = removeElement(result, i);
            }
        }
        return result;
    }
    public static int[] removeElement(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        System.arraycopy(array, 0, newArray, 0, index);
        System.arraycopy(array, index + 1, newArray, index, array.length - index - 1);
        return newArray;
    }
}