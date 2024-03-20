import java.util.ArrayList;
import java.util.Collections;

public class bucketSort {
    static void displayArray(float[] arr) {
        for (float ele: arr) {
            System.out.print(ele+" ");
        }
        System.out.println();
    }

    static float[] bucketSortAlgorithm(float[] arr){
        int n = arr.length;
        //BUCKETS
        ArrayList<Float>[] buckets = new ArrayList[n];

        //CREATE EMPTY BUCKETS
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<Float>();
        }

        //ADD ELEMENTS INTO OUR BUCKETS
        for (int i = 0; i < n; i++) {
            int bucketIndex = (int) arr[i] * n;
            buckets[bucketIndex].add(arr[i]);
        }

        //SORT EACH BUCKET INDIVIDUALLY
        for (int i = 0; i < buckets.length; i++) {
            Collections.sort(buckets[i]);
        }

        //MERGE ALL BUCKETS TO GET FINAL SORTED ARRAY
        int index = 0;
        for (int i = 0; i < n; i++) {
            ArrayList<Float> currBucket = buckets[i];
            for (int j = 0; j < currBucket.size(); j++) {
                arr[index++] = currBucket.get(j);
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        float[] arr = {0.5f, 0.4f, 0.3f, 0.2f, 0.1f};
        displayArray(bucketSortAlgorithm(arr));
    }
}
