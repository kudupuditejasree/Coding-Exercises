import java.util.Scanner;

public class twoNumbersEqualWithoutEquality {
    public static void main(String[] args) {
        int num1,num2;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter first number");
        num1= scanner.nextInt();
        System.out.println("enter second number");
        num2=scanner.nextInt();
        if((num1 ^ num2)==0){
            System.out.println("the two numbers are equal");

        }
        else{
            System.out.println("the 2 numbers are not equal");
        }
    }
}
