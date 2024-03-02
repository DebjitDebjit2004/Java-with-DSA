public class arrayAdvancedProblemsPartB {
    static void printArray(int[] arr){
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    static int[] sortSquares(int[] arr){
        int k = 0, left = 0, right = arr.length - 1;
        int[] ans = new int[arr.length];
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        reverseArray(ans);
        return ans;
    }

    static int[] sortOddAndEvens(int[] arr){
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] % 2 == 0 && arr[right] % 2 != 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (arr[left] % 2 != 0) {
                left ++;
            }
            if (arr[right] % 2 == 0) {
                right--;
            }
        }
        return arr;
    }

    static int[] sortZeroesAndOnes(int[] arr){
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
            if (arr[left] == 0) {
                left ++;
            }
            if (arr[right] == 1) {
                right--;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 0, 1, 0, 1 , 1, 0};
        System.out.print("Zero and One Sorted array is ");
        printArray(sortZeroesAndOnes(arr1));

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Odd and Even Sorted array is ");
        printArray(sortOddAndEvens(arr2));

        int[] arr3 = {-10, -5, -2, 1, 3, 5};
        System.out.print("Square Sorted Array is ");
        printArray(sortSquares(arr3));
    }
}
