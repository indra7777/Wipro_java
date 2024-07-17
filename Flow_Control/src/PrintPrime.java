public class PrintPrime {
    public static void main(String[] args) {
        for(int i=11;i<=98;i++) {
            boolean IsPrime = true;
            for(int j=2;j<=i/2;j++) {
                if(i%j==0) {
                    IsPrime = false;
                    break;
                }
            }
            if(IsPrime){
                System.out.println(i);
            }
        }
    }
}
