package recursion;

/**
 * 阶乘
 */
public class Factorial {

    private static int factorial(int n) {
        if (n >= 0) {
            if (n == 0) {
                return 1;
            } else {
                int temp = n * factorial(n - 1);
                return temp;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int n = 4;
        int result = factorial(n);
        System.out.println(n + "的阶乘的结果是=" + result);
    }
}
