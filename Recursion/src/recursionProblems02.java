public class recursionProblems02 {
    static int sumOfDigit(int n) {
        //BASE CASE
        if (n >=0 && n <= 9) return n;
        //SELF WORK & RECURSIVE WORK
        return sumOfDigit(n / 10) + (n % 10);
    }
    public static void main(String[] args) {
        int n = 123456789;
        System.out.println("Sum of "+n+" is "+sumOfDigit(n));
    }
}
