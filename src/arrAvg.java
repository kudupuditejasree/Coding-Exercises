public class arrAvg {
    public static void main(String[] args) {
        int[] arr=new int[]{3,6,8,4,6};
        int sum=0;
        int avg=0;
        for(int i=0;i<=arr.length-1;i++) {

            sum = sum + arr[i];
        }
                       // avg=sum/arr.length;}
            avg=sum/arr.length;
            System.out.println("avg is "+avg);

    }

}



        //System.out.println("avg is "+avg);


