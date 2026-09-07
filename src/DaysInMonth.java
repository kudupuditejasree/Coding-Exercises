import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the month number:(1-12)");
        int selectMonth= scanner.nextInt();
        switch (selectMonth){
            case 1,3,5,7,8,10,12 :
                System.out.println("31 days");break;
            case 4,6,9,11:
                System.out.println("30 days");break;
            case 2:
                System.out.println("28 or 29 days");
                System.out.println("enter year");
                int year=scanner.nextInt();
                if(year%400==0||(year%4==0 && year%100!=0)) {
                    {
                        System.out.println("29 days");

                    }
                }
                else{
                System.out.println("28 days");
            }

                break;
            default:
                System.out.println("not a valid month");



        }

    }
}
