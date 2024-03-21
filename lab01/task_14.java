import java.util.Arrays;
public class task_14 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 2, 7, 4};
        int[] array2 = {1, 3, 2, 7, 4};

        cycleSwap(array1);
        cycleSwap(array2, 3);

        System.out.println("Result: " + Arrays.toString(array1));
        System.out.println("Result: " + Arrays.toString(array2));
    }
    public static void cycleSwap(int[] array) {
        int temp = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = temp;
    }
    public static void cycleSwap(int[] array, int shift) {
        for (int s = 0; s < shift; s++) {
            int temp = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--) {
                array[i] = array[i - 1];
            }
            array[0] = temp;
        }
    }
}

