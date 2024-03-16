public class countSort {
    static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int ele: arr) {
            if (ele > max) {
                max = ele;
            }
        }
        return max;
    }

    static void countSortAlgorithm(int[] arr) {
        int n = arr.length;
        int[] output = new int[n];
        int max = findMax(arr);

        //MAKE FREQUENCY ARRAY
        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //MAKE PREFIX SUM FROM FREQUENCY ARRAY
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = n - 1; i >= 0; i--) {
            int idx = count[arr[i]] - 1; //position > index
            output[idx] = arr[i];
            count[arr[i]]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4, 2, 2, 3};
        countSortAlgorithm(arr);
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
    }
}
