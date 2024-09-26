import java.util.Random;

public class BubbleSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];

        // Initializing the Array with Random Values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        // Printing the Array Before Sorting
        System.out.println("Before: ");
        printArray(arr);

        // Sorting the Array
        bubbleSort(arr);

        // Printing the Array After Sorting
        System.out.println("\nAfter: ");
        printArray(arr);
    }

    private static void bubbleSort(int[] arr) {
        Boolean sorted;

        do {
            sorted = true;
            for (int i = 0; i < (arr.length - 1); i++) {

                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;

                    sorted = false;
                }

            }
        } while (!sorted);
    }

    private static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.println(i);
        }

    }
}