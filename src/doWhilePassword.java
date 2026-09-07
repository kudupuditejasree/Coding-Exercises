import java.util.Scanner;

public class doWhilePassword {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        final String password = "Teja1234";
        String enteredPassword;
        do {
            System.out.println("enter the password:");
            enteredPassword=scanner.nextLine();
            if(!enteredPassword.equals(password)){
                System.out.println("Invalid password. Try Again..");
            }


        } while (!enteredPassword.equals(password));
        System.out.println("Access Granted!..");

    }
}
