public class SumOfDigits {
    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        int sum = 0;
        for(int i = num;i>0;i /=10){
            sum += i % 10;

        }
        System.out.println(sum);
    }
}
