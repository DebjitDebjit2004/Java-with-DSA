public class mergeSort {
    static void displayArray(int[] arr) {
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        int[] left = new int[n1];
        int[] right = new int[n2];

        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }
        int i = 0;
        int j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

        while (i < n1) {
            arr[k++] = left[i++];
        }

        while (j < n2) {
            arr[k++] = right[j++];
        }

    }
    static void mergeSortAlgorithm(int[] arr, int l, int r) {
        if (l >= r) return;
        int mid = (l + r) / 2;

        mergeSortAlgorithm(arr, l, mid);
        mergeSortAlgorithm(arr, mid+1, r);
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.print("Array Before Sorted: ");
        displayArray(arr);
        mergeSortAlgorithm(arr, 0, arr.length - 1);
        System.out.print("Array After Sorted: ");
        displayArray(arr);
    }
}
