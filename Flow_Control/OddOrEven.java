
public class OddOrEven {
    public static void main(String[] args) {
        if(args.length >= 1){
            for(int i = 0; i < args.length; i++){
                if(CheckNum.stringToInt(args[i]) % 2 == 0){
                    System.out.println(args[i] + " is even");
                }else{
                    System.out.println(args[i] + " is odd");
                }
            }
        }else{
            System.out.println("Please enter a number");
        }
    }
}
