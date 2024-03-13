public class recursionProblems06 {
    static String reverseString(String str, int idx) {
        //BASE CASE
        if (idx == str.length()) return "";
        //RECURSIVE WORK & SELF WORK
        return reverseString(str, idx+1) + str.charAt(idx);
    }
    static String remove_a_fromString(String str, int idx) {
        //BASE CASE
        if (idx == str.length()) return "";
        //RECURSIVE WORK & SELF WORK
        if (str.charAt(idx) != 'a') {
            return str.charAt(idx) + remove_a_fromString(str, idx+1);
        } else {
            return remove_a_fromString(str, idx+1);
        }
    }

    public static void main(String[] args) {
        System.out.println(remove_a_fromString("atif aslam", 0));
        System.out.println(reverseString("atif aslam", 0));
    }
}
