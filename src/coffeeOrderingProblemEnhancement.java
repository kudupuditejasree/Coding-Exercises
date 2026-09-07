import java.util.Scanner;

public class coffeeOrderingProblemEnhancement {
        public static void main(String[] args) {
            System.out.println("*************************\n");
            System.out.println("\u263Awelcome to coffee cafe!\u2615 ");
            System.out.println(" \n*************************");
            System.out.println("\u263A choose your coffee:\n1.Espresso-\u20B9200\n2.cappuccino-\u20B9250\n3.Latte-\u20B9300");
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter your choice:");
            int choice = scanner.nextInt();
            double bill = 0;
            //System.out.println("");
        /*if(choice==1){
            bill = 200;
        } else if (choice==2) {
            bill = 250;      //bill =250
        }else if(choice == 3){
            bill = 300;
        }else {
            System.out.println("Invalid Coffee Choice!");
        }*/
            bill = switch (choice) {
                case 1 -> bill = 200;//break;
                case 2 -> bill = 250;//break;
                case 3 -> bill = 300;//break;
                default -> {
                    System.out.println("invalid coffee choice");
                    yield -1;
                }
            };


            System.out.println("Add whipped cream for ₹30? (yes=1 / no=0)");
            if (bill > 0) {
                int whippedCream = scanner.nextInt();
                // System.out.println("Add whipped cream for ₹30? (yes=1 / no=0)");
                bill += 30;

            }
            System.out.println("Add a flavor shot? (Vanilla for ₹20 or Hazelnut for ₹25) (yes=1 / no=0)");
            int flavor = scanner.nextInt();
            if (flavor == 1) {
                System.out.println("Which one? (Enter 1 for Vanilla & 2 for Hazelnut)");
                int flavorChoice = scanner.nextInt();
//            if(flavorChoice==1){
//                bill+=20;
//            }
//            else if(flavorChoice==2){
//                bill+=25;
//
//            }
                bill = switch (flavorChoice) {
                    case 1 -> {
                        bill += 20;
                        yield bill;
                    }//break;
                    case 2 -> {
                        bill += 25;
                        yield bill;
                    }//break;
                    default -> {
                        System.out.println("invalid flavor choice");
                        yield bill;
                    }
                };
                //System.out.println("total bill is \u20B9" + bill);
            }

            System.out.println("total bill is \u20B9"+bill);
        }
    }


