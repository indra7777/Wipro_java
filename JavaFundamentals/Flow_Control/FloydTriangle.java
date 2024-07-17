public class FloydTriangle {
    public static void main(String[] args) {
        int value = args.length > 0 ? Integer.parseInt(args[0]) : 1;
        for (int i = 1; i <= value; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
