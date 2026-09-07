import java.util.Scanner;

public class nestedIfVote {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter age");
        int age= scanner.nextInt();
        //System.out.println("enter person has citizenship of this country or not(true or false)");
        //boolean isCitizen=scanner.nextBoolean();
        if(age>=18){
            System.out.println("enter person has citizenship of this country or not(true or false)");
            boolean isCitizen=scanner.nextBoolean();
            if(isCitizen){
                System.out.println("you can vote");

            }
            else {

                System.out.println("apply for citizenship");
            }
        }
        else{
            System.out.println("you are too young to vote");
        }
    }
}
