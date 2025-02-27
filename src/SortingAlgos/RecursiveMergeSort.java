package SortingAlgos;

public class RecursiveMergeSort {
    public static void merger(int arr[], int start, int end) {
        if (start == end) {
            return;
        }
        int mid = (start + end) / 2;
        merger(arr, start, mid);
        merger(arr, mid + 1, end);
        helperProgram(arr, start, mid, end);
    }

    public static void helperProgram(int arr[], int start, int mid, int end) {
        int p1 = start;
        int p2 = mid + 1;
        int p3 = 0;
        int forcopy = start;
        int ans[] = new int[end - start + 1];
        while ((p1 <= mid) && (p2 <= end)) {
            if (arr[p1] < arr[p2]) {
                ans[p3] = arr[p1];
                p1++;
                p3++;
            } else {
                ans[p3] = arr[p2];
                p2++;
                p3++;
            }
        }
        while (p1 <= mid) {
            ans[p3] = arr[p1];
            p1++;
            p3++;

        }
        while (p2 <= end) {
            ans[p3] = arr[p2];
            p2++;
            p3++;

        }
        // copy ans array to original array//
        for (int i = 0; i < ans.length; i++) {
            arr[forcopy] = ans[i];
            forcopy++;
        }
    }

    public static void printArray(int[] array) {
        int size = array.length;
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 8, 2, 3, 10, 6, 17, 12, 18, 15 };
        int n = arr.length;
        merger(arr, 0, n - 1);
        printArray(arr);

    }
    // Time complexity nlogn Space complexity n

}
