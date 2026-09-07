public class breakDemo2 {
    public static void main(String[] args) {


        for (int i = 0; i <= 3; i++){
            for(int j=0;j<=3;j++){
                if(i==1 && j==1){
                    System.out.println("Breaking inner loop");
                    break;
                }
                System.out.println("i= "+i+",j= "+j);
            }
        }
    }
}
