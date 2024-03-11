public class recursionProblems02 {
    static int power(int p, int q) {
        //BASE CASE
        if (q == 0) return 1;
        //SELF WORK & RECURSIVE WORK
        return power(p, q-1) * p;
    }

    static int sumOfDigit(int n) {
        //BASE CASE
        if (n >=0 && n <= 9) return n;
        //SELF WORK & RECURSIVE WORK
        return sumOfDigit(n / 10) + (n % 10);
    }

    public static void main(String[] args) {
        int n = 123456789;
        System.out.println("Sum of digit of"+n+" is "+sumOfDigit(n));
        int p = 12;
        int q = 10;
        System.out.println(p+" to the power "+q+" is "+power(p, q));
    }
}
