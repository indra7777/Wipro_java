public class CheckPrime {
    public static void main(String[] args) {
        int num = CheckNum.stringToInt(args[0]);
        for(int i=2;i<num/2;i++) {
            if(num%i==0) {
                System.out.println(num + " is Not a Prime");
                return;
            }
        }
        System.out.println(num + " is a Prime");
    }
}
