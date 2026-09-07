public class breakAndContinue {
    public static void main(String[] args) {
        int num=0;
        while(num<20){
            num++;
            if(num<=7){
                continue;


            }
            //System.out.println("number:"+num);
            if(num>=15){
                break;
            }
            System.out.println("number:"+num);
        }
    }
}
