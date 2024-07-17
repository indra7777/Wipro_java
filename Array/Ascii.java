import java.util.Scanner;

public class Ascii {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner inputObj = new Scanner(System.in);
        System.out.println("Enter 5 numbers : ");
        for (int i = 0; i < 5; i++) {
            arr[i] = inputObj.nextInt();
        }
        for (int num : arr) {
            char ch = (char) num;
            System.out.print(ch + " ");
        }
        System.out.println();
    }
}
