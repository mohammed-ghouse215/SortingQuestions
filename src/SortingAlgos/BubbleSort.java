package SortingAlgos;

public class BubbleSort {
    public static void swapper(int[] a, int index1, int index2) {
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
        int arr[] = { -1, 8, 3, 12, 0, -2 };
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapper(arr, j, j + 1);
                }
            }
        }
        printArray(arr);

    }

}
