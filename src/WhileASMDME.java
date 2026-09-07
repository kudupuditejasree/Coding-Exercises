import java.util.Scanner;

public class WhileASMDME {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            System.out.println("***********************");
            System.out.println("welcome to calculator");
            System.out.println("***********************");
            System.out.println("1.Addition\n2.subtraction\n3.Multiplication\n4.Division\n5.Modulo\n6.exit");
            System.out.println("enter your choice(1-6):");
            choice = scanner.nextInt();
            switch (choice) {

                case 1:
                    System.out.println("enter num1 and num2:");
                    int num1 = scanner.nextInt();
                    int num2 = scanner.nextInt();
                    int result = num1 + num2;
                    System.out.println("addition of "+num1+" and "+num2+" is  " + result);
                    break;
                case 2:
                    System.out.println("enter num1 and num2:");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();

                    System.out.println("subtraction of "+num1+" and "+num2+" is "+(num1-num2));
                    break;
                case 3:
                    System.out.println("enter num1 and num2:");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    System.out.println("multiplication of "+num1+" and "+num2+" is "+(num1*num2));
                    break;
                case 4:
                    System.out.println("enter num1 and num2:");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    if (num2==0){
                        System.out.println("invalid number:Dividing by 0 is undefined" );
                    }else {
                        System.out.println("division of " + num1 + " and " + num2 + " is " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("enter num1 and num2:");
                    num1 = scanner.nextInt();
                    num2 = scanner.nextInt();
                    if (num2==0){
                        System.out.println("invalid number:modulo division by 0 is undefined" );
                    }else {
                        System.out.println("modulo of " + num1 + " and " + num2 + " is " + (num1 % num2));
                    }
                    break;
                case 6:
                    System.out.println("exiting the calculator...");
                default:
                    System.out.println("Invalid choice.Try Again....");




            }
        }while (choice!=6);
       /* System.out.println("enter num1");
        int num1=scanner.nextInt();
        System.out.println("enter num2");
        int num2= scanner.nextInt();*/



        scanner.close();
        }


    }

