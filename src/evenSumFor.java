import java.util.Scanner;

public class evenSumFor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        int num= scanner.nextInt();
        System.out.println("enter start range");
        int start= scanner.nextInt();

        int sum=0;
        for(int i=start;i<=num;i++){
            if(i%2==0){
                sum+=i;
               // System.out.println("sum of even numbers= "+sum);
            }
        }
        System.out.println("sum of even numbers= "+sum);
    }
}
