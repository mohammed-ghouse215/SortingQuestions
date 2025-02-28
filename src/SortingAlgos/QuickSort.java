package SortingAlgos;

public class QuickSort {

    public static int rearrange(int array[], int start, int end) {
        int p1 = start + 1;
        int p2 = end;
        while (p1 <= p2) {
            if (array[p1] <= array[start]) {
                p1++;
            } else if (array[p2] > array[start]) {
                p2--;
            } else {
                swapper(array, p1, p2);
            }
        }
        swapper(array, start, p2);
        return p2;
    }

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

    public static void QuickSort(int A[], int start, int end) {
        if (start >= end) {
            return;
        }
        int p = rearrange(A, start, end);
        QuickSort(A, start, p - 1);
        QuickSort(A, p + 1, end);
    }

    public static void main(String[] args) {
        int A[] = { 18, 8, 6, 3, 11, 14, 23, 20, 31, 27 };
        QuickSort(A, 0, A.length - 1);
        printArray(A);

    }

}
