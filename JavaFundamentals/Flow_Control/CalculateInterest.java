public class CalculateInterest {
    public static void main(String[] args) {
        String gender = args[0];
        int age = CheckNum.stringToInt(args[1]);
        if(gender.equals("Male")){
            if(age>=1 && age<=58){
                System.out.println("Interest is 8.4%");
            }else{
                System.out.println("Interest is 10.5%");
            }
        }else {
            if(age>=1 && age<=58){
                System.out.println("Interest is 8.2%");
            }else{
                System.out.println("Interest is 9.2%");
            }
        }
    }
}
