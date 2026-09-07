import java.util.Scanner;

public class switchEnhancement {
//    static int add(int a,int b){
//        return a+b;
//    }
    public static void main(String[] args) {
//        int sum = add(4, 5);
//        System.out.println("sum is" + sum);
       Scanner scanner=new Scanner(System.in);
        System.out.println("enter number(1-7)");
        int dayNumber=scanner.nextInt();
        switch(dayNumber){
            case 1,2,3,4,5->{
//                int a=10;
//                System.out.println(a);
                System.out.println("weekday");
                System.out.println("its time to work");
            }
               // break;
            case 6,7->{
//                    int a=89;
//            System.out.println(a);
                System.out.println("weekend");}
                //break;
            default->
                System.out.println(" invalid day number");
        }
    }
}
