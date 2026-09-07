import java.util.Scanner;

public class allDtype {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter byte no:");
        byte a= scanner.nextByte();
        System.out.println("enter short no:");
        short b= scanner.nextShort();
        System.out.println("enter int no:");
        int c=scanner.nextInt();
        System.out.println("enter long no:");
        long d= scanner.nextLong();
        System.out.println("enter float num");
        float e= scanner.nextFloat();
        System.out.println("enter double value");
        double f= scanner.nextDouble();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }
}
