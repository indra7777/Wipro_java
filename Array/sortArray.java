import java.util.Scanner;

public class sortArray {

    public static void main(String[] args) {
        int arr[] = new int[5];
        Scanner inputObj = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = inputObj.nextInt();
        }

        //sorting algorithm ( bubble sort)
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.print("Sorted array :");
        for (int num : arr) {
            System.out.print(" " + num);
        }
        System.out.println();
    }
}
