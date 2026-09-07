import java.util.Scanner;

public class LcmLogic {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=scanner.nextInt();
        System.out.println("enter num2");

        int num2=scanner.nextInt();
        int max=num1>num2?num1:num2;
        int lcm=max;
        while(true){
            if(lcm%num1==0 &&lcm%num2==0){
                break;
            }
            lcm+=max;
        }
        System.out.println("The LCM of"+num1+" and"+num2+"is:"+lcm);


    }
}
