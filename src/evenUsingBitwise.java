import java.util.Scanner;

public class evenUsingBitwise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to check even or odd");
        int num = scanner.nextInt();
        if ((num & 1) == 0) {
            System.out.println("the number is even");
        }
        else{
            System.out.println("the number is odd");
        }
    }
}
