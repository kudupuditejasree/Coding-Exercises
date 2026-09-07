import java.util.Scanner;

public class feet {
    public static void main(String[] args) {
        System.out.println("enter inches=:");
        Scanner scanner=new Scanner(System.in);
        float inches= scanner.nextFloat();
        float feet=inches/12;
        System.out.println("the converted inches into foot:"+feet);

    }

}
