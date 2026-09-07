public class breakSwitch {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            System.out.println("inside for");
            switch(i){
                case 1:
                    System.out.println(i);
                    break;
                case 2:
                    System.out.println(i);
                    break;
                case 3:
                    System.out.println(i);
                    break;
            }
            System.out.println("outside switch");
        }
        System.out.println("outside for");
    }
}
