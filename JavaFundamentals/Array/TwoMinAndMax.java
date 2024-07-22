import java.lang.Integer;
import java.util.Scanner;

public class TwoMinAndMax {

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner inputObj = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = inputObj.nextInt();
        }
        int firstMin = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        int firstMax = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int num : arr) {
            if (secondMin > num) {
                if (firstMin > num) {
                    secondMin = firstMin;
                    firstMin = num;
                } else {
                    secondMin = num;
                }
            }
            if (secondMax < num) {
                if (firstMax < num) {
                    secondMax = firstMax;
                    firstMax = num;
                } else {
                    secondMax = num;
                }
            }
        }
        System.out.println("First Max number : " + firstMax);
        System.out.println("Second Max number : " + secondMax);
        System.out.println("First Min number : " + firstMin);
        System.out.println("Second Min number : " + secondMin);
    }
}
