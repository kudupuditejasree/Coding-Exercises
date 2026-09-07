import java.util.Scanner;

public class PrimeFor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        int num= scanner.nextInt();
        boolean isPrime=true;
        if(num<=1){
            //System.out.println("it is not a prime num");
            isPrime=false;
        }
        else {

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    // System.out.println("NOT A PRIME");
                    isPrime = false;
                    break;
                    //System.out.println("number factors are "+i);
                }
            }
        }
                /*else {
                    System.out.println("it is prime");
                    break;*/
                if(isPrime){
                    System.out.println("it is prime num");

                }
                else{
                    System.out.println("not a prime");
                }

            scanner.close();
    }
}
