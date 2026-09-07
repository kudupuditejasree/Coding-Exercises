import java.util.Scanner;

public class maximum3 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a:");

        a=scanner.nextInt();
        System.out.println("enter b");
        b=scanner.nextInt();
        System.out.println("enter c");
        c=scanner.nextInt();
        int max=a>b? (a>c ? a:c) : (b>c? b:c);
        System.out.println("max is    "+  max);



    }
}
