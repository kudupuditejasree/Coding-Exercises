import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter base:");
        double base= scanner.nextDouble();
        System.out.println("enter height:");

        double height= scanner.nextDouble();
        double area=(0.5)*(base*height);
        System.out.println("area is : "+ area);
    }
}
