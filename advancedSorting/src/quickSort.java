public class quickSort {
    static void displayArray(int[] arr) {
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    static int partition(int[] arr, int st, int end) {
        //PART 1 --> CHOSE PIVOT ELEMENT AND WE PUT IT AT ITS RIGHT POSITION ----> PIVOT INDEX
        int pivot = arr[st];
        int count = 0;
        for (int i = st + 1; i <= end; i++) {
            if (arr[i] <= pivot) {
                count++;
            }
        }
        int pivotEleIndex = st + count;
        swap(arr, st, pivotEleIndex);

        //PART 2 --> WE REARRANGE ELEMENTS BEFORE AND AFTER PIVOT INDEX SUCH THAT (ele<=PIVOT<ele)
        int i = st, j = end;
        while (i < pivotEleIndex && j > pivotEleIndex) {
            while (arr[i] <= pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i < pivotEleIndex && j > pivotEleIndex) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotEleIndex;
    }

    static void quickSortAlgorithm(int[] arr, int st, int end) {
        if (st >= end) return;
        int pi = partition(arr, st, end);
        quickSortAlgorithm(arr, st, pi - 1);
        quickSortAlgorithm(arr, pi + 1, end);
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        quickSortAlgorithm(arr, 0, arr.length - 1);
        displayArray(arr);
    }
}