import java.util.Scanner;

public class ifEven {
    public static void main(String[] args) {
        int num;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num:");
        num= scanner.nextInt();
        if(num % 2==0)
        {
            System.out.println("number is even");

        }
        if(num>0){
            System.out.println("number is positive");

        }
        if(num==0){
            System.out.println("number is zero");
        }
        System.out.println("outside if");
    }
}
