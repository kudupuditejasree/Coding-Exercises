import java.util.Scanner;

public class negativeAbsDivisor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scanner.nextInt();
        int count=1;
        for(int i=1;i<=(Math.abs(num))/2;i++) {
            if (num % i == 0) {
                System.out.println(-i+" is divisor of "+num);
                count++;
            }
        }
        System.out.println("total count is "+count);

    }
}
