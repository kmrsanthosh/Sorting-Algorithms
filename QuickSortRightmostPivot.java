import java.util.Random;

// Quick Sort Algorithm With Rightmost Element As Pivot

class QuickSortRightmostPivot {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = rand.nextInt(100);
        }

        // Before Sorting
        System.out.println("Before: ");
        printArray(arr);

        // Performing Sorting
        quickSort(arr, 0, arr.length - 1);

        // After Sorting
        System.out.println("\nAfter: ");
        printArray(arr);
    }

    private static void quickSort(int[] arr, int lowIndex, int highIndex) {
        // Stop if there is only one element in the array
        if (lowIndex >= highIndex)
            return;

        // Choose the pivot element
        int pivot = arr[highIndex];

        // Choose the left and right pointer
        int leftPointer = lowIndex;
        int rightPointer = highIndex;

        while (leftPointer < rightPointer) {
            while (arr[leftPointer] <= pivot && leftPointer < rightPointer) {
                leftPointer++;
            }
            while (arr[rightPointer] >= pivot && leftPointer < rightPointer) {
                rightPointer--;
            }
            swap(arr, leftPointer, rightPointer);
        }

        // Swap pivot element with leftpointer
        swap(arr, leftPointer, highIndex);

        quickSort(arr, lowIndex, leftPointer - 1);
        quickSort(arr, leftPointer + 1, highIndex);
    }

    private static void swap(int[] arr, int lowIndex, int highIndex) {
        int temp = arr[lowIndex];
        arr[lowIndex] = arr[highIndex];
        arr[highIndex] = temp;
    }

    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}