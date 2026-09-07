public class arrayCoding {
    static int[] arr={3,3,4,5,1,2};

    public static void main(String[] args) {


        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + " " + arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        System.out.println(arr[0]);
    }
}
