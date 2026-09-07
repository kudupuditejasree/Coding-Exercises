import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter n value:");
        int n=scanner.nextInt();
        int t1 = 0;
        int t2 = 1;
        int t3=0;
        if(n<=0){
            System.out.println("please enter a positive number");
        }
        else if(n==1){
            System.out.println("the fibonacci series is "+ t1);
            System.out.println("the"+ n+"th fibonacci number is: "+t1);
        }
        else {
           //
            System.out.print( " fibonacci series is " + t1 + " " + t2);
            for (int i = 3; i <= n; i++) {
                //int t1=0;
                // int t2=1;
                t3 = t1 + t2;
               System.out.print(" " + t3);
                t1 = t2;
                t2 = t3;
                //System.out.println(t3);
            }
            //System.out.println("the nth fibonacci number is:"+" "+t3);
            System.out.print("\nthe "+ n+"th fibonacci number is: "+t2);
        }
       // System.out.println("the"+ n+"th fibonacci number is: "+t3);
    }
}
