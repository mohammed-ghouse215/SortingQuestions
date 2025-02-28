package BinarySearch;

public class BinarySearchAlgo {
    public static boolean SearchInArray(int A[], int K) {
        int left = 0;
        int right = A.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (A[mid] == K) {
                return true;
            } else if (A[mid] > K) {
                right = mid - 1;
            } else if (A[mid] < K) {
                left = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int A[] = { 3, 6, 8, 12, 14, 19, 20, 23, 25, 27 };
        int K = 14;
        System.out.println(SearchInArray(A, K));

    }

}
