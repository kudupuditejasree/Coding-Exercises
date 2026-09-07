import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter principal amount");
        int p=scanner.nextInt();
        System.out.println("enter rate of interest");
        double r= scanner.nextDouble();
        System.out.println("enter time(in years)");
        double t= scanner.nextDouble();
        double SI=(p*r*t)/100;
        System.out.println("simple interest= "+SI);
        scanner.close();


    }

}
