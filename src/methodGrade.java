public class methodGrade {
    static void scoreGrade(String name,char grade){

            System.out.println("the name of student is "+name+" and got "+grade+" grade");
        }
        //static void CalculateGrade(char grade){
    static  char calculateGrade(int score){
        if(score>=90){
            return 'A';

        }
        else if(score>=80&&score<=89){
            return 'B';
        }
        else if(score>=70&&score<=79){
            return 'C';
        }
        else if(score>=60&&score<=69){
            return 'D';
        }
        else {
            return 'F';
        }





    }
    public static void main(String[] args) {
       // System.out.println(scoreGrade("Teja",87));
        char grade=calculateGrade(89);
        char grade1=calculateGrade(75);
        scoreGrade("teja",grade);
        scoreGrade("sweety",grade1);


    }
}
