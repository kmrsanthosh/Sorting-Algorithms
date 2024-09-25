import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }

        // Printing The Array Before Sorting
        System.out.println("Before: ");
        printArray(arr);

        // Perform Sorting The Array
        mergeSort(arr);

        // Printing The Array After Sorting
        System.out.println("\nAfter: ");
        printArray(arr);
    }

    private static void mergeSort(int[] arr) {
        int arrLength = arr.length;

        // Return if arr is a single element array
        if (arrLength < 2)
            return;

        int midIndex = arrLength / 2;
        int[] leftArr = new int[midIndex];
        int[] rightArr = new int[arrLength - midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftArr[i] = arr[i];
        }

        for (int i = midIndex; i < arrLength; i++) {
            rightArr[i - midIndex] = arr[i];
        }

        mergeSort(leftArr);
        mergeSort(rightArr);

        merge(arr, leftArr, rightArr);

    }

    private static void merge(int[] arr, int[] leftArr, int[] rightArr) {

        // Here, i is the index for leftArr, j is the index for rightArr,
        // k is the index for arr
        int i = 0, j = 0, k = 0;

        while (i < leftArr.length && j < rightArr.length) {
            if (leftArr[i] < rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < leftArr.length) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < rightArr.length) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

}
