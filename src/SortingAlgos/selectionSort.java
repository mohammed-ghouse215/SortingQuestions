package SortingAlgos;

public class selectionSort {
    public static void swapper(int a[], int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void printArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 8, 4, -1, 7, 10, 5, 6 };
        int n = arr.length;
        // ======using nested loops======//
        for (int i = 0; i < n; i++) {
            int min_element = arr[i];
            int min_index = i;
            for (int j = i; j < n; j++) {
                if (arr[j] < min_element) {
                    min_element = arr[j];
                    min_index = j;
                }
            }
            swapper(arr, i, min_index);

        }
        printArray(arr);
    }

}
