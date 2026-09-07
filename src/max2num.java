import java.util.Scanner;

public class max2num {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num1");
        int num1= scanner.nextInt();
        System.out.println("enter num2");
        int num2= scanner.nextInt();
        if (num1>num2){
            System.out.println("num1 is max");

        }
        else{
            System.out.println("num2 is max");
        }
        scanner.close();
    }
}
