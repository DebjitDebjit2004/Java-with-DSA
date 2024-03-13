public class recursionProblems04 {
    static int sumOfAllElement(int[] arr, int idx) {
        //BASE CASE
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        //RECURSIVE WORK
        return arr[idx] + sumOfAllElement(arr, idx+1);
    }

    static int maximumElement(int[] arr, int idx) {
        //BASE CASE
        if (idx == arr.length - 1) {
            return arr[idx];
        }
        //RECURSIVE WORK
        return Math.max(maximumElement(arr, idx + 1), arr[idx]);
    }

    static void printArray(int[] arr, int idx) {
        //BASE CASE
        if (idx == arr.length) return;
        //SELF WORK
        System.out.print(arr[idx]+" ");
        //RECURSIVE WORK
        printArray(arr, idx+1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printArray(arr, 0);
        System.out.println();

        System.out.println(maximumElement(arr, 0));
        System.out.println(sumOfAllElement(arr, 0));
    }
}
