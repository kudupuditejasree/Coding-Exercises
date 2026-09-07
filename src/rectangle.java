import java.util.Scanner;

public class rectangle {
    public static void main(String[] args) {
        System.out.println("enter length=");
        Scanner scanner=new Scanner(System.in);
        int length= scanner.nextInt();
        System.out.println("enter breadth=");
        int breadth= scanner.nextInt();
        int area=length*breadth;
        System.out.println("area is " + area);
    }
}
