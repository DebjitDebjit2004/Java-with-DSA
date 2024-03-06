public class Assignment4 {

    //Minimum Platforms Given arrival and departure times of all trains that reach a railway station. Find the minimum number of platforms required for the railway station so that no train is kept waiting. Consider that all the trains arrive at the same day and leave on the same day. Arrival and departure time can never be the same for a train we can have arrival time of one train equal to departure time of the other. At any given instance of time, same platform can not be used for both departure of a train and arrival of another train. In such cases, we need different platforms
    static int minimumPlatform(int[] arrival, int[] departure) {
        int minimumPlatform = 0;
        for (int i = 1; i < arrival.length; i++) {
            if (departure[i - 1] > arrival[i]){
                minimumPlatform++;
            }
        }
        return minimumPlatform;
    }

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

    // Given an array of positive and negative numbers, arrange them in an alternate fashion such that every positive number is followed by a negative and vice-versa maintaining the order of appearance. The number of positive and negative numbers need not be equal. Begin with a negative number. If there are more positive numbers, they appear at the end of the array. If there are more negative numbers, they too appear at the end of the array.
    static void negativePositiveViceVersa(int[] arr) {

    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 5, 4, 3, 2};
        if (firstRepeatingEle(arr) > -1) {
            System.out.println("Index of first repeating element is "+firstRepeatingEle(arr));
        } else {
            System.out.println("Not Found Repeating Element");
        }

        int[] arrival = {900, 940, 950, 1100, 1500, 1800, 1940};
        int[] departure = {910, 1200, 1120, 1130, 1900, 2000, 2000};
        int minPlat = minimumPlatform(arrival, departure);
        if (minPlat == 0) {
            System.out.println("Minimum platform required is "+minPlat + 1);
        } else {
            System.out.println("Minimum platform required is "+minPlat);
        }

    }
}
