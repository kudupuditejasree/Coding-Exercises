import java.util.Scanner;

public class powerNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter base value");
        int base = scanner.nextInt();
        System.out.println("enter power value");
        int power = scanner.nextInt();
        int i;
        int powerOfNum = 1;
        for (i = 1; i <= power; i++) {
            powerOfNum = powerOfNum * base;
            //
        }
        // System.out.println("power of the number is"+powerOfNum);

        System.out.println(base+" " +"to the power of "+power+" is " + powerOfNum);
        scanner.close();
    }

}
