import java.util.Scanner;

public class countNumberOfDivisors {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scanner.nextInt();
        int count=0;
        for(int i=1;i<=num;i++) {
            if (num % i == 0) {
                System.out.println(i+" is divisor of "+num);
                count++;
            }
        }
        System.out.println("total count is "+count);


    }
}
