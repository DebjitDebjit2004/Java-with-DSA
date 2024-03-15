public class recursionProblems08 {
    static int best(int[] h, int idx) {
        if (idx == h.length - 1) return 0;
        int op1 = best(h, idx+1) + Math.abs((h[idx + 1] - h[idx]));
        if (idx == h.length - 2) return op1;
        int op2 = best(h, idx + 2) + Math.abs((h[idx + 2] - h[idx]));

        return Math.min(op1, op2);
    }
    public static void main(String[] args) {
        int[] arr = {10, 30, 40, 20};
        System.out.println(best(arr, 0));
    }
}
