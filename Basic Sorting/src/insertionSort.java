public class insertionSort {
    static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    static int[] insertionSortAlgorithm(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i;
            while (j > 0 && arr[j] < arr[j - 1]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                j--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 2, 1, 4};
        printArray(insertionSortAlgorithm(arr));
    }
}
