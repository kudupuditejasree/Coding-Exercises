import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number:" );
        int num= scanner.nextInt();
        if(num>=0){
            System.out.println("number is positive");
        }
        else{
            System.out.println("the number is negative");
        }
        System.out.println("outside");
    }
}
