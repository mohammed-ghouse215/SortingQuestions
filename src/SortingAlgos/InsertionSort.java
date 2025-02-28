package SortingAlgos;

public class InsertionSort {
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
        int A[] = { 2, 8, 4, -1, 7, 10, 5, 6 };
        int n = A.length;
        for (int i = 1; i < n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (A[j] > A[j + 1]) {
                    swapper(A, j, j + 1);
                }
            }
        }
        printArray(A);
    }

}
