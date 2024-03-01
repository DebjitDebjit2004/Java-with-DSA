public class arrayBasicProblems {
    static Boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static int lastOccurrence(int[] array, int x){
        int idx = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x){
                idx = i;
            }
        }
        return idx;
    }

    static int countOccurrence(int[] arr, int x){
        int count = 0;
        for (int ele: arr){
            if (ele == x){
                count++;
            }
        }
        return count;
    }

    static boolean searchEle(int[] arr, int x){
        for (int ele: arr){
            if (ele == x){
                return true;
            }
        }
        return false;
    }

    static int maxValue(int[] arr){
        int ans = Integer.MIN_VALUE;
        for (int ele : arr) {
            if (ele > ans) {
                ans = ele;
            }
        }
        return ans;
    }

    static int sumOfEle(int[] arr){
        int sum = 0;
        for (int ele: arr){
            sum += ele;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 4, 5, 13, 12, 5, 6};
        int x = 5;
        System.out.println("Sum of all the element is "+sumOfEle(array));
        System.out.println("Maximum Value out of the all element is "+maxValue(array));

        if (searchEle(array, 5)){
            System.out.println("Element Present in the Array");
        } else {
            System.out.println("Element Not Present in the Array");
        }

        System.out.println("Number of occurrence of the "+x+" is "+countOccurrence(array, x));
        System.out.println("Last occurrence of the "+x+" is "+lastOccurrence(array, x));

        if (isSorted(array)) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is not Sorted");
        }
    }
}
