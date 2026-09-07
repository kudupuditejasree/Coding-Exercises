import java.util.Scanner;

public class gCommonDivisor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number 1:");
        int num1=scanner.nextInt();
        System.out.println("enter number 2:");

        int num2=scanner.nextInt();
        int min=num1<num2?num1:num2;
        int gcd=1;
        for(int i=min;i>=1;i--){
            if(num1%i==0 && num2%i==0){
                gcd=i;
                break;
            }


        }
        System.out.println("The GCD of "+num1+" and "+num2+"is: "+gcd);
    }
}
