public class MethodOverloadingExercise {
    static void  calculator(int a,int b){
        System.out.println(a+b);
    }
    static void calculator(double a,double b){
        System.out.println(a*b);
    }
    static void calculator(int a,int b,String operation){

    }

    public static void main(String[] args) {

        calculator(2,5);
        calculator(5,2,"+");
        calculator(2.3,3);



    }
}
