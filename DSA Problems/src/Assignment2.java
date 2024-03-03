public class Assignment2 {
    static void printArray(int[] arr){
        for (int ele: arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    //Given an unsorted array A of size N that contains only non-negative integers, find a continuous sub-array which adds to a given number S. In case of multiple sub arrays, return the sub array which comes first on moving from left to right. You need to print the start and end index of answer sub array.
    static void indexOfSubArray(int[] arr, int s){
        //5, 7, 12, 9, 1, 4, 3
        for (int i = 0; i < arr.length - 1; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum > s){
                    break;
                }
                if (sum == s){
                    System.out.println("First Index: "+i);
                    System.out.println("Second Index: "+j);
                    return;
                }
            }
        }
        System.out.println("No sub-array found with the given sum.");
    }

    //Given an array arr[] and an integer K where K is smaller than size of array, the task is to find the Kth smallest element in the given array. It is given that all array elements are distinct.
    static int kthSmallestElement(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr[k - 1];
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
        System.out.print("Changed Array is ");
        printArray(firstNegativeSecondPositive(arr));

        int[] arr1 = {7, 10, 4, 3, 20};
        int k = 2;
        System.out.println("Kth Smallest element is "+kthSmallestElement(arr1, k));

        int[] arr2 = {19, 13, 8, 2, 1, 4, 3};
        int s = 15;
        indexOfSubArray(arr2, s);
    }
}
