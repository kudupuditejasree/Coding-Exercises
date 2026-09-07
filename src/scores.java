import java.util.Scanner;

public class scores {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter score (between 0-100)");
        float score= scanner.nextFloat();
        if(score<0 || score>100){
            System.out.println("enter valid marks between 0 to 100");
        }
        else {


            if (score >=90 ) {
                System.out.println("grade is A");
            } else if (score >=80 ) {
                System.out.println("grade is B");

            } else if (score >=70 ) {
                System.out.println("Grade is c");

            } else if (score >=60 ) {
                System.out.println("grade is D");

            } else if (score >=50) {
                System.out.println("grade is E");
            } else {
                System.out.println("fail");
            }
        }
    }
}
