public class sum {
    public static void main(String[] args) {
        if(args.length == 2){
            System.out.println(stringToInt(args[0]) + stringToInt(args[1]));
        }else{
            System.out.println("please enter two numbers");
        }

    }
    public static int stringToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = (s.charAt(i) - '0' ) + (sum * ((int) Math.pow(10, i) ));
//            System.out.println(sum);
        }

        return sum;
    }

}
