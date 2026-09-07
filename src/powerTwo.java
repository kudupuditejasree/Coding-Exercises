import java.util.Scanner;

public class powerTwo {
    public static void main(String[] args) {
        int num;
        System.out.println("enter value of num");
        Scanner scanner=new Scanner(System.in);
        num=scanner.nextInt();
        if((num>0)&&(num & num-1)==0){
            System.out.println("yes the number is power of two");


        }
        else{
            System.out.println("the number is not power of two");
        }
    }
}
