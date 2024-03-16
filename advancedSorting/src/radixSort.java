public class radixSort {
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele: arr) {
            if (ele > max) {
                max = ele;
            }
        }
        return max;
    }

    static void countSortAlgorithm(int[] arr, int place) {
        int n = arr.length;
        int[] output = new int[n];

        //MAKE FREQUENCY ARRAY
        int[] count = new int[10];
        for (int i = 0; i < arr.length; i++) {
            count[(arr[i] / place) % 10]++;
        }

        //MAKE PREFIX SUM FROM FREQUENCY ARRAY
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int idx = count[(arr[i]/place) % 10] - 1; //position > index
            output[idx] = arr[i];
            count[(arr[i] / place) % 10]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }

    static void radixSortAlgorithm(int[] arr) {
        int max = findMax(arr);
        for (int place = 1; max / place > 0; place *= 10) {
            countSortAlgorithm(arr, place);
        }
    }

    public static void main(String[] args) {
        int[] arr = {0, 55, 31, 75, 44, 204, 170, 675, 555};
        radixSortAlgorithm(arr);
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
    }
}
