import java.util.Scanner;

public class MulFor {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter N value");
        int n= scanner.nextInt();
        int result;
        System.out.println("The multiplication table of "+n+" is");
        for(int i=1;i<=10;i++){
            result=n*i;
            System.out.println(n +" * " +i  +" = "+result);
        }
    }
}
