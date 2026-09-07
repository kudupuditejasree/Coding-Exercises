import java.util.Scanner;

public class FactorialUsingFor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num");
        int num=scanner.nextInt();
        long fact=1;
        if(num<0){
            System.out.println("invalid number");
        }
        else {
            //  for(int i=1;i<=num;i++){
            for (int i = num; i >= 1; i--) {
                fact *= i;
                //System.out.println("factorial of num= "+factorial);
            }
            System.out.println("factorial of num= " + fact);
        }
    }
}
