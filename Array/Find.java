public class Find {
    public static void main(String[] args) {
        int arr[] = {1,4,34,56,7};
        int num = StringToInt(args[0]) ;
        if(num==-1){
            return;
        }
        for(int i = 0;i< arr.length;i++){
            if(num == arr[i]){
                System.out.println(num + " Found at index : " + i);
                return;
            }
        }
        System.out.println(num + " Not Found ");

    }
    public static int StringToInt(String s){
        int sum = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='0' && ch <= '9'){
                sum = (sum * 10) + (ch - '0');
            }else{
                return -1;
            }
        }
        return sum;
    }
}