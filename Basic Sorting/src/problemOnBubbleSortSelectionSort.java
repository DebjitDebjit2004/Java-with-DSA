public class problemOnBubbleSortSelectionSort {
    static void displayArray(int[] arr) {
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
    }
    static int[] firstNonZeroThenZero(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 1; j < n; j++) {
                if (arr[j] != 0 && arr[j - 1] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return arr;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0, 5, 4, 3, 0, 0, 1};
        displayArray(firstNonZeroThenZero(arr));
    }
}
