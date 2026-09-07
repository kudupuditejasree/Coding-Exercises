import java.util.Scanner;

public class swapNo3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in) ;
        System.out.println("enter value of a:");
        int a= scanner.nextInt();
        System.out.println("enter value of b:");
        int b= scanner.nextInt();
        System.out.println("swapping of 2 numbers without using third variable:");
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a value after swaping is"+a);
        System.out.println("b value after swaping is"+b);

    }
}
