import java.util.Scanner;

public class reverseGivenNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number :");
        int num= scanner.nextInt();
        int remainder;
        int reversedNumber=0;
        for(;num!=0;num=num/10){
             remainder=num%10;
            reversedNumber=reversedNumber*10+remainder;
            //

        }
        System.out.println("reversed number is"+reversedNumber);
    }
}
