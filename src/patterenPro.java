import java.util.Scanner;

public class patterenPro {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter no of rows:");
        int rows= scanner.nextInt();
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" @ ");
            }
            System.out.println(" ");
        }

    }
}
