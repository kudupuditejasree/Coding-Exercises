import java.util.Scanner;

public class DoWhileUntilValid {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    //System.out.println("Enter a valid number between 1-50:");
    int num;//= scanner.nextInt();

    do {
        //System.out.println("invalid num.\n please enter valid number:");
        System.out.println("Enter a valid number between 1-50:");
        num = scanner.nextInt();
        if(num<1||num>50){
            System.out.println("invalid num.\n please enter valid number:");

        }


    }
    while(num<1 || num>50);
    System.out.println("you entered "+num+" and this is valid number");

}
}


