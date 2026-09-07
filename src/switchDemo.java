import java.util.Scanner;

public class switchDemo {
    public static void main(String[] args) {
        byte choice;
        //final  int a=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number from 1 to 7:");
        choice= scanner.nextByte();
        //Integer wrapperIntType=Integer.valueOf(choice);
        //choice=scanner.next().charAt(0);
        switch (choice){

            case 1: case 2: case 3: case 4: case 5:
                System.out.println("weekday");
                break;
            case 6: case 7:
                System.out.println("weekend");
            default:
                System.out.println("invalid day choice");
        }
    }
}
