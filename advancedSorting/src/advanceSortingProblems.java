public class advanceSortingProblems {
    static void displayArray(int[] num) {
        for (int ele: num) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static int[] dutchNationalFlagProblem(int[] arr) {
        int low = 0, mid = 0, hi = arr.length - 1;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, hi);
                hi--;
            }
        }
        return arr;
    }
    static int[] sortArray1(int[] arr) {
        int n = arr.length;
        int x = -1, y = -1;

        if (arr.length <= 1) { //corner cases
            return arr;
        }
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) { //first conflict
                    x = i -1;
                    y = i;
                } else { //second conflict
                    y = i;
                }
            }
        }

        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {3, 8, 6, 7, 5, 9, 10};
        displayArray(sortArray1(arr));
        int[] arr1 = {2, 0, 0, 1, 0, 1, 1, 2, 0, 1};
        displayArray(dutchNationalFlagProblem(arr1));
    }
}
