import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int a,b;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter choice(0 or 1)");
        System.out.println("enter 0 for addition");
        System.out.println("enter 1 for subrtaction");
        int choice=scanner.nextInt();
        System.out.println("enter a:");
        a=scanner.nextInt();
        System.out.println("enter b:");
        b=scanner.nextInt();
        if(choice==0){
            System.out.println("addition of a and b is:"+(a+b));

        }
        else {
            System.out.println("subtraction of a and b is:"+(a-b));
        }
    }
}
