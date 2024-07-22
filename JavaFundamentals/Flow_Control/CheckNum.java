public class CheckNum {
    public static void main(String[] args) {
        if(args.length == 1){
            int value = stringToInt(args[0]);
            if(value < 0){
                System.out.println("You have entered a negative integer");
            } else if (value > 0) {
                System.out.println("You have entered a positive integer");
            }else{
                System.out.println("You have entered Zero");
            }
        } else if (args.length == 2) {
            System.out.println(lastDigit(stringToInt(args[0]),stringToInt(args[1])));
        }
        else{
            System.out.println("Enter a valid integers");
        }
    }
    public static Boolean lastDigit(int a ,int b){
        if(a % 10 == b % 10){
            return true;
        }else{
            return false;
        }
    }
    public static int stringToInt(String s){
        int sum = 0;
        for(int i=0;i<s.length();i++){
            sum = sum * 10 + s.charAt(i) - '0';
        }
        return sum;
    }
}
