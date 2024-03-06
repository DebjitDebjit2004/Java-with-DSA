public class bubbleSort {
    static void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    static int[] bubbleSortAlgorithm(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swap = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                return arr;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {5 , 6, 3, 2, 1, 4};
        printArray(bubbleSortAlgorithm(arr));
    }
}
