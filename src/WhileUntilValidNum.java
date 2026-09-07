import java.util.Scanner;

public class WhileUntilValidNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a valid number between 1-50:");
        int num= scanner.nextInt();

        while(num<1 || num>50)
        {
            System.out.println("invalid num.\n please enter valid number:");
            num= scanner.nextInt();



        }
        System.out.println("you entered "+num+" and this is valid number");

    }
}

