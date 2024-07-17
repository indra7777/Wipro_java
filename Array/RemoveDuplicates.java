public class RemoveDuplicates {

    public static void main(String[] args) {
        int arr[] = { 12, 34, 12, 45, 67, 89, 45 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    int k = j;
                    for (; k < arr.length - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    arr[k] = -1;
                }
            }
        }

        for (int num : arr) {
            System.out.print(" " + num);
        }
        System.out.println();
    }
}
