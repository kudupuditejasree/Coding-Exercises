public class forEachLoopExercises {
    public static void main(String[] args) {
        //print sum of all elements of an integer array using for each loop
        int[] numbers={3,6,9,3,6,9};
        int sum=0;
        for(int num:numbers){
            sum+=num;


        }
        System.out.println("sum is : "+sum);
        //count how many times a specific character appears in a given character array
        char[] character={'s','p','p','g','t'};
        char target='p';
        int count=0;
        for(char ch:character) {
            if (ch == target) {
                count++;
            }
        }

            System.out.println("character count is: " + count);


        //print all the even numbers from an integer array
        int[] number={2,4,8,9,2,1,1};
        for(int nums:number){
            if(nums%2==0){
                System.out.print(nums+" ");
            }
        }




    }
}
