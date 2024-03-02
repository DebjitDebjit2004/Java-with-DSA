public class Assignment1 {
    //Find the first peak element in the array {1, 1, 3, 4, 2, 3, 5, 7, 0} Peak element is the one which is greater than its immediate left neighbor and its immediate right neighbor. Leftmost and rightmost element cannot be a peak element
    static int peakElement(int[] arr) {
        int ans = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1] && arr[i] > ans){
                ans = arr[i];
            }
        }
        return ans;
    }

    //Calculate the minimum element in the array {2, -3, 5, 8, 1, 0, -4} using standard library method for calculating the minimum element
    static int minimumElement(int[] arr) {
        int ans = Integer.MAX_VALUE;
        for (int ele: arr) {
            if (ele < ans){
                ans = ele;
            }
        }
        return ans;
    }

    //Traverse over the elements of the array {1,2,3,4,5,6,7,8} using for each loop and print all even elements.
    static void evenElement(int[] arr) {
        System.out.print("Even Elements are: ");
        for (int ele: arr) {
            if (ele % 2 == 0){
                System.out.print(ele+" ");
            }
        }
        System.out.println();
    }

    //Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all strings stored on odd indices of the array
    static void oddIndices(String[] arr) {
        System.out.print("Element of Odd Indices: ");
        for (int i = 1; i < arr.length; i += 2) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();

    }

    //Given an array of integers {2, 6, -15, -1, 0, 4, -9}, print only the positive values present in the array
    static void positiveEle(int[] arr) {
        System.out.print("Positive Elements are: ");
        for (int ele: arr){
            if (ele > 0) {
                System.out.print(ele+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {2, 6, -15, -1, 0, 4, -9};
        positiveEle(array);

        String[] array1 = {"ab", "bc", "cd", "de", "ef", "fg", "gh"};
        oddIndices(array1);

        int[] array2 = {1, 2, 3, 4, 5, 6, 7, 8};
        evenElement(array2);

        System.out.println("Minimum Element of array is "+minimumElement(array));

        int[] array3 = {1, 1, -3, 4, 2, 13, 5, 7, 0};
        System.out.println("Peak Element is "+peakElement(array3));
    }
}
