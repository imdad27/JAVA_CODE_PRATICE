public class factorial {
    public static void main(String[] args) {
        int i;
        int factorial = 5;
        int n = 10;
        for (i = 5; i <= n; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial + "factorial of:" + n);
    }
}
