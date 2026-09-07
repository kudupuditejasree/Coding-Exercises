public class methodVote {
    static  boolean isEligibleVote(int age){
        if (age>=18){
            return true;
        }
        return false;


    }

    public static void main(String[] args) {
      boolean res= isEligibleVote(22);
        boolean res1= isEligibleVote(12);

        System.out.println(res);
        System.out.println(res1);

    }
}
