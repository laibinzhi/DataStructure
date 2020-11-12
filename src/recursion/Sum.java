package recursion;

public class Sum {


    private static int sum(int[] arrs) {
        return getSum(arrs, 0);
    }

    private static int getSum(int[] arrs, int l) {
        if (l == arrs.length) {
            return 0;
        }
        return arrs[l] + getSum(arrs, l + 1);
    }


    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int result = sum(arr);
        System.out.println("result=" + result);
    }
}
