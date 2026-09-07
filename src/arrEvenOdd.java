public class arrEvenOdd {
    public static void main(String[] args) {
        int even;
        int odd;
         int count=0;
         int count1=0;
         //int num;
         int[] arr=new int[]{1,2,5,8,9,6,4};
         for(int i=0;i<=arr.length-1;i++){

             if(arr[i]%2==0){
                 //System.out.println("even");
                 count++;

             }
             if(arr[i]% 2!=0){
                 count1++;
             }


         }
        System.out.println("even count="+count);
        System.out.println("odd count="+count1);
    }
}
