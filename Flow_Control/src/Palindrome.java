public class Palindrome {
    public static void main(String[] args) {
        int value = args.length > 0 ? Integer.parseInt(args[0]) : 0;
        int reverseNumber = 0;
        int temp = value;
        while(value>0){
            reverseNumber=reverseNumber*10+value%10;
            value=value/10;
        }
        if(reverseNumber==temp){
            System.out.println(temp + "is a Palindrome");
        }else{
            System.out.println(temp + "is not a palindrome");
        }
    }
}
