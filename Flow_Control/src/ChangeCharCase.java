public class ChangeCharCase {
    public static void main(String[] args) {
        char ch = args[0].charAt(0);
        if(ch>='A' && ch<='Z') {
            ch += 32;
        } else if (ch>='a' && ch<='z') {
            ch -= 32;
        }
        System.out.println("The character is " + ch);
    }
}
