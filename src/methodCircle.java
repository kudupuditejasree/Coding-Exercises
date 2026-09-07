public class methodCircle {
    static final double pi=3.14;
    static void isCircumference(double radius){
        double circumference=2*pi*radius;
        System.out.println("the circumference of cicle is "+circumference);
    }
    static void isArea(double radius){
        double Area=pi*radius*radius;
        System.out.println("the area of circle is "+Area);
    }

    public static void main(String[] args) {
        isCircumference(4);
        isArea(2);

    }
}
