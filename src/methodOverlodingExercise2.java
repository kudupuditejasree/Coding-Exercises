public class methodOverlodingExercise2 {
    static int  calculators(int a,int b){
        return a+b;
    }
    static double calculators(double a,double b){
        return a*b;
    }
    static int calculators(int a,int b,String operation){
        switch(operation){
            case "+": return a+b;
            case "-": return a-b;
            case "*": return a*b;
            case "/":
                if(b==0){
                    System.out.println("error:division By Zero");
                    return -1;
                }
                else {
                    return a / b;
                }
            default:
                System.out.println("not a valid operation");
                return -1;

        }
    }

    public static void main(String[] args) {
        System.out.println(calculators(5,9,"/"));
        System.out.println(calculators(5,2));
        System.out.println(calculators(2.0,5));
        System.out.println("4=5:"+calculators(4,5,"="));

    }
}
