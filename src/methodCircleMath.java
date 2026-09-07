public class methodCircleMath {
    static  void calculateCircleCircumference(double radius){
        double area=Math.PI*radius*radius;
        double circumference=2*Math.PI*radius;
        System.out.println("area="+area);
        System.out.println("circumference= "+circumference);
    }
    public static void main(String[] args) {
        calculateCircleCircumference(22);
        calculateCircleCircumference(2);
    }
}
