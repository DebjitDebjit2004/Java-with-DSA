import java.util.ArrayList;

public class recursionProblems07 {
    static void arraySubsetSum(int[] arr, int sum, int idx) {
        //BASE CASE
        if (idx == arr.length) {
            System.out.print(sum+" ");
            return;
        }

        //Self work & recursive work
        int choiceEle = arr[idx];
        arraySubsetSum(arr, sum + choiceEle, idx+1);
        arraySubsetSum(arr, sum, idx+1);
    }
    static void printSSQ(String str, String choiceEle) {
        //BASE CASE
        if (str.isEmpty()) {
            System.out.print(choiceEle+" ");
            return;
        }
        //Self work & recursive work
        char choiceChar = str.charAt(0);
        String remString = str.substring(1);
        printSSQ(remString, choiceEle+choiceChar); //include
        printSSQ(remString, choiceEle); //exclude
    }

    static ArrayList<String> getSSQ(String str) {
        ArrayList<String> ans = new ArrayList<>();
        //BASE CASE
        if (str.isEmpty()) {
            ans.add("");
            return ans;
        }

        //SELF WORK
        char curr = str.charAt(0);

        //RECURSIVE WORK
        ArrayList<String> smallAns = getSSQ(str.substring(1));

        //SELF WORK
        for (String ss: smallAns) {
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = getSSQ("abcd");
        for (String ss: ans) {
            System.out.print(ss+" ");
        }
        System.out.println();
        printSSQ("abc", "");
        System.out.println();
        int[] arr = {1, 2, 3};
        arraySubsetSum(arr, 0, 0);

    }
}
