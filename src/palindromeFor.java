import java.util.Scanner;

public class palindromeFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number to check it is palindrome or not:");
        int num = scanner.nextInt();
        int originalNum = num;
        //int result;
        int remainder;
        int reversedNum = 0;
        for(;num!=0;num=num/10){
            remainder=num%10;
            //result = remainder;
            reversedNum = reversedNum * 10 + remainder;
        }
        if (originalNum == reversedNum) {
            System.out.println("the number is palindrome");
            //break;
        } else {
            System.out.println("the number is not a palindrome");
            //break;
        }
        scanner.close();


    }
}




