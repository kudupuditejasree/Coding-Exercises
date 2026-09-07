import java.util.Scanner;

public class DigitSum {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number " +
                ":");
        int num = scanner.nextInt();

       // int originalNum = num;
        //int result;
        int remainder;
        int sumOfDigit=0;
       /* if(num==0){
            System.out.println("sum is 1");
        }*/
       // int reversedNum = 0;
        for(;num!=0;num=num/10){
            remainder=num%10;
            //result = remainder;
            sumOfDigit = sumOfDigit  + remainder;
           // System.out.println("sum is"+sumOfDigit);

        }
        System.out.println("sum is"+sumOfDigit);
    }
}
