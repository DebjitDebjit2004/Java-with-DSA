public class Assignment2 {
    static void printArray(int[] arr){
        for (int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    // Given an unsorted array arr[] of size N having both negative and positive integers, place all negative elements at the end of array without changing the order of positive elements and negative elements
    static int[] firstNegativeSecondPositive(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < 0 && arr[j + 1] >= 0){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        System.out.print("Original Array is ");
        printArray(arr);

        int[] arr1 = firstNegativeSecondPositive(arr);
        System.out.print("Changed Array is ");
        printArray(arr);
    }
}
