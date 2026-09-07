public class arrayMin {
    public static void main(String[] args) {
        int[] arr=new int[]{2,6,1,7,8,9};
        int min=arr[0];
        for(int i=0;i<=arr.length-1;i++){
            if(arr[i]<min){
                min=arr[i];

            }
        }
        System.out.println("minimum element is "+min);

    }
}
