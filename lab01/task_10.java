public class task_10 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Max number: " + max(array));
    }
    public static int max(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
