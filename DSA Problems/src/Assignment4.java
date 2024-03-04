public class Assignment4 {
    //Given an array arr[] of size n, find the first repeating element. The element should occur more than once and the index of its first occurrence should be the smallest. If no repeating element exists, print -1. (Assume 1 based indexing)
    static int firstRepeatingEle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return i + 1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 5, 4, 3, 2};
        if (firstRepeatingEle(arr) > -1) {
            System.out.println("Index of first repeating element is "+firstRepeatingEle(arr));
        } else {
            System.out.println("Not Found Repeating Element");
        }
    }
}
