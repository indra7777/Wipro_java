public class Calculator {
    public static int powerInt(int a, int b) {
        int prod = 1;
        for (int i = 0; i < b; i++) {
            prod *= a;
        }
        return prod;
    }

    public static double powerDouble(double a, int b) {
        return Math.pow(a, b);
    }

    public static void main(String[] args) {
        System.out.println(powerInt(2, 3));
        System.out.println(powerDouble(2.0, 3));
    }
}
