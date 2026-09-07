public class arrayMax {
    public static void main(String[] args) {
        int[] arr=new int[]{22,33,44,11,66};
        int max=arr[0];

        for(int i=1;i<=arr.length-1;i++){
            if(arr[i]>max){
                max=arr[i];
              //  System.out.println("the maximum element is"+max);
            }
            //System.out.println("the maximum element is"+max);
        }
       System.out.println("the maximum element is"+max);
    }
}
