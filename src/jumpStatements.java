public class jumpStatements {
    public static void main(String[] args) {
       /* for(int i=1;i<=10;i++){
            if(i==5){
                break;
                //System.out.println("hi");
            }
            System.out.println(i);
        }*/
        /*outerLoop:for (int i = 0; i < 3; i++) {
            innerLoop:for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    System.out.println("breaking inner loop..");

                    break innerLoop;
                    //System.out.println("hi");
                }
                System.out.println("i=" + i + " " + "j=" + j);
            }
        }*/
        int a=5;
        labelIf:if(a==5){
            System.out.println(a);
           break labelIf;

        }
        int number = 4;
        outer:
        if (number > 0) {
            System.out.println("number is positive");
            if (number % 2 == 0) {
                System.out.println("number is even");
            } else {
                System.out.println("number is odd");
                break outer;
            }
            System.out.println("this will print only if the number is even");

        }
        System.out.println("this is outside the labled block");
        /*if(number==3){
            System.out.println("outside outer label");
            break outer;
        }
        System.out.println("This is outside the labled block.");*/










    }
}

