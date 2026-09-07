public class ForLoopDemo {
    static  int sum;
    public static void main(String[] args) {
        sum=0;
        int j=3;
        for (int i=1;i<=20 && sum<=50;i=i+j){
            sum=sum+i;
            System.out.println("i= "+i+" "+"sum= "+sum);
        }
    }
}
