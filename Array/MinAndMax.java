public class MinAndMax {
    public static void main(String[] args) {
        int []arr = {6,3,4,9,1,4,0};
        int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
            } else if (max < arr[i]) {
                max = arr[i];
            }else{
                continue;
            }
        }
        System.out.println("Min number : " + min);
        System.out.println("Max number : " + max);
    }
}