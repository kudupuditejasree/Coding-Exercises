import java.util.Scanner;

public class perfectNum {
    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of num:");
        int num = scanner.nextInt();
        if (num < 1) {
            System.out.println("Invalid number:");
        } else {
            for (int i = 1; i <= num / 2; i++) {
                if (num % i == 0) {

                    sum += i;
                    //System.out.println(sum);

                }
            }
            System.out.println("the sum is  " + sum);

            if (sum == num) {
                System.out.println("it is perfect number");
            } else {
                System.out.println("it is not a perfect number");
            }
        }
    }
}


