import java.util.Scanner;

public class grades {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter score:");
        int score= scanner.nextInt();
//        System.out.println("enter choice:");
//        int choice= scanner.nextInt();
//        switch (choice){
//            case 1->
        if(score<0||score>100){
            System.out.println("invalid marks");
        }
        else {
           String grade= switch (score/10){
                case 9,10->{
                    System.out.println("your marks are"+score);
                    yield "A";
                }
//                    System.out.println("A");
                   // break;
                case 8->"B";
                    //System.out.println("B");
                    //break;
                case 7->"C";
                   // System.out.println("c");
                   // break;
                case 6->"D";
                   // System.out.println("D");
                   // break;
                default->"F";
                   // System.out.println("F");

            };
            System.out.println("you got : "+grade);
        }
    }


}
