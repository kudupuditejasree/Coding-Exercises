import java.util.Scanner;

public class productFpn {
    public static void main(String[] args) {
        System.out.println("enter 1 float no:");
        Scanner scanner=new Scanner(System.in);
        float num1=scanner.nextFloat();
        System.out.println("enter 2 float no:");
        float num2= scanner.nextFloat();
        float product=num1*num2;
        System.out.println("product is:  "+product);
    }
}
