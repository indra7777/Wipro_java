public class SecondLastDigit{
    public static void main(String[] args) {
        Scanner inputObj = new Scanner(System.in);
        int num = inputObj.nextInt();
        if(num<10 && num > -10 ){
            System.out.println("no second digit number");
        }
        if(num<0){
            num = -num;
        }
        num /= 10;
        int secondLastDigit = num % 10;
        System.out.println(lastDigit);
    }
}