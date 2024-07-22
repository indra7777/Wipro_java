public class ReverseNumber {
    public static void main(String[] args) {
        int value = args.length>0?Integer.parseInt(args[0]):0;
        int reverseNumber = 0;
        while(value>0){
            reverseNumber=reverseNumber*10+value%10;
            value=value/10;
        }
        System.out.println(reverseNumber);
    }
}
