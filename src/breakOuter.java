public class breakOuter {
    public static void main(String[] args) {
        outerFor:for (int i = 0; i < 3; i++){
            innerLoop:for(int j=0;j<3;j++){
                if(i==1 && j==1){
                    System.out.println("Breaking both loops....");
                     break outerFor;
                }
                System.out.println("i= "+i+",j= "+j);
            }
        }
    }
}
