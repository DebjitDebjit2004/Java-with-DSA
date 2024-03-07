public class recursionBasics {
    static void printFromNTo1(int n) {
        //BASE CASE
        if (n == 1) {
            System.out.print(n+" ");
            return;
        }
        //SELF WORK
        System.out.print(n+" ");
        //RECURSIVE WORK / SUB PROBLEM
        printFrom1ToN(n - 1);
    }
    static void printFrom1ToN(int n) {
        //BASE CASE
        if (n == 1) {
            System.out.print(n+" ");
            return;
        }
        //RECURSIVE WORK / SUB PROBLEM
        printFrom1ToN(n - 1);
        //SELF WORK
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 5;
        printFrom1ToN(n);
        System.out.println();
        printFromNTo1(n);
    }
}
