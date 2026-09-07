import java.util.Scanner;

public class sumUsingFor {
    public static void main(String[] args) {

        System.out.println("enter N value:");
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        int sum=0;
        for(int i=1;i<=n;i++) {
            sum += i;
        }
            System.out.println(sum);

    }
}
