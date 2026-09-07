import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
        System.out.println("enter age:");
        int age= scanner.nextInt();
        System.out.println("enter boolean value for india citizen or not:");
        boolean indtiaCitizen= scanner.nextBoolean();
        if((age>=18)&&(indtiaCitizen)){
            System.out.println("the person is eligible to vote");
        }
        else{
            System.out.println("the person is not eligible to vote");
        }

    }
}
