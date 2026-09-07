import java.util.Scanner;

public class nestedIfElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number");
        int num= scanner.nextInt();
        if(num>=0){
            System.out.println("the number is positive");
            if(num%2==0){
                System.out.println("number is even");
            }
            else{
                System.out.println("number is odd");

            }

        }
        else {
            System.out.println("the number is not positive");
        }
    }
}
