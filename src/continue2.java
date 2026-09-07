public class continue2 {
    public static void main(String[] args) {


        outerloop:for(int i=1;i<=3;i++){
        System.out.println("outer loop iteration: "+i);
        for(int j=1;j<=3;j++) {
            // System.out.println("skipping inner loop iteration when j is:");
            if (j == 2) {
                System.out.println("skipping inner loop iteration when j is:"+j);
                continue outerloop;
            }
            System.out.println("Inner loop iteration: "+j);
             }
        }
   }
}
