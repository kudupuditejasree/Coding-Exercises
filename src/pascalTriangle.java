import java.util.Scanner;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter number of rows:");
        int rows=scanner.nextInt();
        System.out.println("enter number of columns:");
        int columns= scanner.nextInt();
        for (int i=0;i<rows;i++){
            for(int j=0;j<rows-i-1;j++){
                System.out.print("");
            }
            int num=1;
            for(int j=0;j<=i;j++){
                System.out.print(num+" ");
                num=num*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}
