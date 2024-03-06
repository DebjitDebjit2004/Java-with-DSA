public class selectionSort {
    static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    static int[] selectionSortAlgorithm(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min_index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]){
                    min_index = j;
                }
            }
            if (min_index != i) {
                int temp = arr[min_index];
                arr[min_index] = arr[i];
                arr[i] = temp;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 5, 6, 4};
        printArray(selectionSortAlgorithm(arr));
    }
}
