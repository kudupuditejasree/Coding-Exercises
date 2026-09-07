import java.util.Scanner;

public class checkPNZ {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number");
        int number=scanner.nextInt();
        if(number>0){
            System.out.println("positive number");
        }
        else if (number<0) {
            System.out.println("negative number");
            
        }
        else {
            System.out.println("zero");
        }

    }
}
