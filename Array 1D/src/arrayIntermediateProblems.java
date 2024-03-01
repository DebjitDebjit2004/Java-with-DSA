public class arrayIntermediateProblems {
    static int firstRepeatedEle(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }

    static int uniqueEle(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > -1){
                return arr[i];
            }
        }

        return -1;
    }

    static int tripletSum(int[] array, int target){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == target){
                        count++;
                    }
                }

            }
        }
        return count;
    }

    static int twoSum(int[] array, int target){
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] array = {4, 1, 2, 6, 3, 5, 8, 2};
        int target = 7;
        System.out.println("The Total Number of Pairs whose sum is equal to the "+target+" is "+twoSum(array, target));
        System.out.println("The Total Number of Triplet whose sum is equal to the "+target+" is "+tripletSum(array, target));

        int[] array_1 = {2, 4, 3, 2, 5, 4, 5};
        int[] array_2 = {6, 4, 3, 2, 9, 2, 11};
        System.out.println("Unique Element is "+uniqueEle(array_1));
        System.out.println("First Repeated Element is "+firstRepeatedEle(array_2));

    }
}
