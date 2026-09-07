public class arrSum {
    public static void main(String[] args) {
        int[] arr=new int[]{3,9,4,5,2};
        int sum=0;
        for(int i=0;i<=arr.length-1;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum of array is "+sum);
    }
}
