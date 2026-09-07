import java.util.Scanner;

public class countDigits {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number :");
        int num = scanner.nextInt();
        int remainder;
        int count = 0;
        int originalNum = num;
        if (num == 0) {
            count= 1;
        } else {

            for (; num != 0; num /= 10) {
                remainder = num % 10;

                count += 1;
                //System.out.println(count);
            }
        }
        System.out.println(originalNum + " has " + count + " digits");
    }
}

