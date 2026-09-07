import java.util.Scanner;

public class divisorCountNextMethod {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scanner.nextInt();
        int count=1;

        if(num==0){
            System.out.println("zero has infinite number of divisors");
            return;
        }
        for(int i=1;i<=num/2;i++) {
            if (num % i == 0) {
                System.out.println(i+" is divisor of "+num);
                count++;
            }
        }
        System.out.println("total count is "+count);

    }
}
