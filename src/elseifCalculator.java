import java.util.Scanner;

public class elseifCalculator {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter choice(0 to 4)");//you can use \n to print all statements
        System.out.println("enter 0 for addition");
        System.out.println("enter 1 for subtraction");
        System.out.println("enter 2 for multiplication");
        System.out.println("enter 3 for division");
        System.out.println("enter 4 for modulo");
        int choice=scanner.nextInt();
        System.out.println("enter a:");
        a=scanner.nextInt();
        System.out.println("enter b:");
        b=scanner.nextInt();
        if(choice<0 ||choice>5)
        {
            System.out.println("invalid choice");
        }
        else {
            if (choice == 0) {
                System.out.println("addition of a and b is:" + (a + b));

            } else if (choice == 1) {
                System.out.println("subtraction of a and b is:" + (a - b));
            } else if (choice == 2) {
                int mul = a * b;
                System.out.println("multiplication of a and b is:" + mul);

            } else if (choice == 3) {
                float div = a / b;
                System.out.println("division os a and b is:" + div);

            } else if (choice == 4) {
                int mod = a % b;
                System.out.println("modulo of a and b is:" + mod);

            } else {
                System.out.println("enter valid choice");
            }
        }
    }
}
