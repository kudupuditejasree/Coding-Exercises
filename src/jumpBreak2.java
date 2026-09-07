public class jumpBreak2 {
    public static void main(String[] args) {
        outer:for (int i = 0; i < 3; i++){
            inner:for(int j=0;j<3;j++){
                if(i==1 && j==1){
                    System.out.println("Breaking both loops");
                    continue outer;
                }
                System.out.println("i= "+i+",j= "+j);
            }
        }
        for(int i=1;i<=3;i++){
            System.out.println("outer loop iteration: "+i);
            for(int j=1;j<=3;j++) {
                // System.out.println("skipping inner loop iteration when j is:");
                if (j == 2) {
                    System.out.println("skipping inner loop iteration when j is:"+j);
                    continue;
                }
                System.out.println("Inner loop iteration: "+j);
                }
            }
        labelblock:
        {
            System.out.println("hi");
        }
        int a=8;
        label:a=4;
        System.out.println(a);
        }

    }


