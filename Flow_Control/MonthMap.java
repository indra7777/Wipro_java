public class MonthMap {
    public static void main(String[] args) {
        int monthNum = CheckNum.stringToInt(args[0]);
        switch (monthNum) {
            case 1:System.out.println("O/P Expected : January");break;
            case 2:System.out.println("O/P Expected : February");break;
            case 3:System.out.println("O/P Expected : March");break;
            case 4:System.out.println("O/P Expected : April");break;
            case 5:System.out.println("O/P Expected : May");break;
            case 6:System.out.println("O/P Expected : June");break;
            case 7:System.out.println("O/P Expected : July");break;
            case 8:System.out.println("O/P Expected : August");break;
            case 9:System.out.println("O/P Expected : September");break;
            case 10:System.out.println("O/P Expected : October");break;
            case 11:System.out.println("O/P Expected : November");break;
            case 12:System.out.println("O/P Expected : December");break;
            default:System.out.println("Invalid month number");break;
        }
    }
}
