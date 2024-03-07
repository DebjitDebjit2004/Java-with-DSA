public class recursionProblems01 {
    static int fibonacciTerm(int n) {
        //BASE CASE
        if (n == 0 || n == 1) return n;
        //SELF WORK & RECURSIVE WORK
        return fibonacciTerm(n - 1) + fibonacciTerm(n - 2);
    }

    static int factorial(int n) {
        //BASE CASE
        if (n == 0) return 1;
        //SELF WORK & RECURSIVE WORK
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 11; i++) {
            System.out.println("Factorial of "+i+" is "+factorial(i));
        }

        for (int i = 0; i < 11; i++) {
            System.out.print(fibonacciTerm(i)+", ");
        }
    }
}
