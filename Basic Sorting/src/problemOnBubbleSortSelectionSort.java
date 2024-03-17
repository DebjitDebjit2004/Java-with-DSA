public class problemOnBubbleSortSelectionSort {
    static void displayStringArray(String[] arr) {
        for (String ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    static void displayIntArray(int[] arr) {
        for (int ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    static String[] dictionaryOrder(String[] book) {
        int n = book.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (book[j].compareTo(book[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            String temp = book[i];
            book[i] = book[minIndex];
            book[minIndex] = temp;
        }
        return book;
    }

    static int[] firstNonZeroThenZero(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 1; j < n; j++) {
                if (arr[j] != 0 && arr[j - 1] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                return arr;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {0, 5, 4, 3, 0, 0, 1};
        displayIntArray(firstNonZeroThenZero(arr));

        String[] book = {"Red", "Green", "Blue", "White", "Pink", "Yellow"};
        displayStringArray(dictionaryOrder(book));
    }
}
