public class Application {

    static int[] arr = {10, 9, 8, 5, 7, 30, 20, 100, 0};
    public static void main(String[] args) {
        System.out.println("Your array: ");
        printArray();

        int index = minValue(arr);
        System.out.println("\nThe smallest element in this array is: " + arr[index]);
    }

    public static void printArray() {
        for (int eArray : arr) {
            System.out.print(eArray + "\t");
        }
    }

    public static int minValue(int[] array) {
        int min = array[0];
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }

        }
        return index;
    }
}
