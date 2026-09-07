import java.util.Scanner;

public class concert {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
        System.out.println("enter age:");
        int age= scanner.nextInt();
        System.out.println("enter boolean value for having ticket or not:");
        boolean HaveTicket= scanner.nextBoolean();
        System.out.println("enter boolean value for invited by vip or not");
        boolean VipPass=scanner.nextBoolean();
        if ((age>=18)&&(HaveTicket||VipPass)){
            System.out.println("the person is allowed to concert");
        }
        else{
            System.out.println("the person is not allowed to concert");
        }
        scanner.close();
    }
}
