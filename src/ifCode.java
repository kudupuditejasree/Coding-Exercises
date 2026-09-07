import java.util.Scanner;

public class ifCode {
    public static void main(String[] args) {
        int age;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter age:");
        age= scanner.nextInt();
        if(age>65){
            System.out.println("apply discount ");

        }
        System.out.println("outside if");
    }
}
