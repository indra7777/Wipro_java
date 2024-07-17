public class CompareChar {
    public static void main(String[] args) {
        char first = args[0].charAt(0);
        char second = args[1].charAt(0);

        if(first > second){
            System.out.println(second + "," + first);
        }else{
            System.out.println(first + "," + second);
        }
    }
}
