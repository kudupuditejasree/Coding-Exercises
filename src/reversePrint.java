import java.util.Scanner;

public class reversePrint {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter value of n");
        int n= scanner.nextInt();
        int i;
        for (i=n;i>0;i--){
            System.out.println(i);
                    }
        scanner.close();
    }
}
