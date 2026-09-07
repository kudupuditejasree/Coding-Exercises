import java.util.Scanner;

public class coffee {
    public static void main(String[] args) {
        System.out.println("*********************************");
        System.out.println("welcome to coffee ordering system");
        System.out.println("*********************************");
        System.out.println("enter 1.cappucino\n2.espresso\n3.lattee");
        Scanner scanner=new Scanner(System.in);
        int choice= scanner.nextInt();
        double bill=0;
        bill=switch (choice){
            case 1->bill=200;
            case 2->bill=250;
            case 3->bill=300;
            default -> {
                System.out.println("invalid choice");
                yield -1;
            }

        };
        System.out.println("add whipped cream for 30?(yes=1,no=0)");
        if(bill>0) {
            int WhippedCream = scanner.nextInt();
            if (WhippedCream == 1) {
                bill += 30;
            }
        }

            System.out.println("Add flavour shot?(vanilla for 20 and hazelnut for 30)(yes=1 or no=0)");
            //System.out.println();
            int flavour = scanner.nextInt();
            if (flavour == 1) {
                System.out.println("vanilla for 20 and hazelnut for 30(vanilla=1 and hazelnut=2)");
                int flavourChoice = scanner.nextInt();
                if (flavourChoice == 1) {
                    bill += 20;
                } else if (flavourChoice == 2) {
                    bill += 30;
                } else {
                    System.out.println("invalid choice");

                }

            }

        System.out.println("total bill is"+bill);
    }
}
