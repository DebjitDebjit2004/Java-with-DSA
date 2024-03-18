//SEARCHING IN ROTATED SORTED ARRAY

public class binarySearchProblems02 {
    static int searchEle(int[] arr, int target) {
        int st = 0, end = arr.length - 1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] < arr[end]) {
                if (target > arr[mid] && target <= arr[end]) {
                    st = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target >= arr[st] && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    st = mid + 1;
                }
            }
        }
        return -1;
    }
    static int findMin(int[] arr) {
        int st = 0, end = arr.length - 1;
        int ans = -1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (arr[mid] <= arr[arr.length - 1]) {
                ans = mid;
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(findMin(arr));
        System.out.println(searchEle(arr, 4));
    }
}
