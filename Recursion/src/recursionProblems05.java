public class recursionProblems05 {
    static void linerSearchReturnAllIndex(int[] arr, int idx, int target) {
        //BASE CASE
        if (idx == arr.length) {
            return;
        }
        //SELF WORK
        if (arr[idx] == target) System.out.println(idx);
        //RECURSIVE WORK
        linerSearchReturnAllIndex(arr, idx+1, target);
    }

    static int linearSearchReturnIndex(int[] arr, int idx, int target) {
        //BASE CASE
        if (idx == arr.length) {
            return -1;
        }
        //SELF WORK
        if (arr[idx] == target) return idx;
        //RECURSIVE WORK
        return linearSearchReturnIndex(arr, idx+1, target);
    }

    static boolean linearSearch(int[] arr, int idx, int target) {
        //BASE CASE
        if (idx == arr.length) {
            return false;
        }
        //SELF WORK
        if (arr[idx] == target) return true;
        //RECURSIVE WORK
        return linearSearch(arr, idx+1, target);
    }

    public static void main(String[] args) {
        int[] arr = {4, 6, 1, 8, 6, 6, 2};
        if (linearSearch(arr, 0, 8)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        if (linearSearchReturnIndex(arr, 0, 6) > -1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        linerSearchReturnAllIndex(arr, 0, 6);
    }
}
