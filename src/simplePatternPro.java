import java.util.Scanner;

public class simplePatternPro {
    public static void main(String[] args) {
        System.out.println("enter number of rows");
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        //p1
        System.out.println("1:");
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        //p2
        System.out.println("2:");
        for (int i=1;i<=n;i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //p3
        System.out.println("3:");
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        //p
        /*System.out.println("4:");
       for (int i=1;i<=n;i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }*/
        //p5
        System.out.println("5:");
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //p6
        System.out.println("6:");
       for (int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("7:");
        for (int i=1;i<=n;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n-i; j++) {
                System.out.print(+n);
            }
            System.out.println();
        }

        scanner.close();
    }
}
