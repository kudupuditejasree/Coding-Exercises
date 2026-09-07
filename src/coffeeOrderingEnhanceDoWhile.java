import java.util.Scanner;

public class coffeeOrderingEnhanceDoWhile {
    public static void main(String[] args) {
        //System.out.println("Enter your choice:");
        Scanner scanner=new Scanner(System.in);

        int choice;
        do {

            System.out.println("*************************\n");
            System.out.println("\u263A Welcome to Coffee Cafe! \u2615");
            System.out.println("\n*************************");

            System.out.println("\u263A Choose your coffee:");
            System.out.println("1. Espresso - \u20B9200");
            System.out.println("2. Cappuccino - \u20B9250");
            System.out.println("3. Latte - \u20B9300");

            //Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            double bill = switch (choice) {

                case 1 -> 200;
                case 2 -> 250;
                case 3 -> 300;

                default -> {
                    System.out.println("Invalid coffee choice!,Please try again...");
                    yield -1;
                }
            };

            // Continue only if coffee choice is valid
            if (bill > 0) {

                System.out.println("Add whipped cream for ₹30? (yes=1 / no=0)");
                int whippedCream = scanner.nextInt();

                if (whippedCream == 1) {
                    bill += 30;
                }

                System.out.println(
                        "Add a flavor shot? (Vanilla for ₹20 or Hazelnut for ₹25) (yes=1 / no=0)"
                );

                int flavor = scanner.nextInt();

                if (flavor == 1) {
                    int flavorChoice;
                    do {

                        System.out.println(
                                "Which one? (Enter 1 for Vanilla & 2 for Hazelnut)"
                        );

                        flavorChoice = scanner.nextInt();

                        bill = switch (flavorChoice) {

                            case 1 -> bill + 20;

                            case 2 -> bill + 25;

                            default -> {
                                System.out.println("Invalid flavor choice!");
                                yield bill;
                            }
                        };
                    }while (flavorChoice!=1 && flavorChoice!=2);
                }

                System.out.println("Total bill is \u20B9" + bill);
            }


        }while (choice<1 || choice>1);

    }
}


