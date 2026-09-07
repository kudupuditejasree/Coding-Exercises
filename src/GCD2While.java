import java.util.Scanner;
//mistakes
public class GCD2While {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=scanner.nextInt();
        System.out.println("enter num2");

        int num2=scanner.nextInt();
        System.out.println("enter min");
        int min=scanner.nextInt();
        int gcd=1;
        while (num2 != 0) {
           int temp=num2;
           num2=num1 % num2;
           num1=temp;
           gcd+=num2;
        }
        System.out.println("gcd is"+gcd);
        }
        //System.out.println("gcd is"+num2);

}
