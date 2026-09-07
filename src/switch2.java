public class switch2 {
    public static void main(String[] args) {
        enum Day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
        Day day=Day.Sunday;
        switch (day){
            case Monday:
                System.out.println("weekday");
                break;
            default:
                System.out.println("invalid choice");
                break;
            case Friday:
                System.out.println("weekday");
                break;
            case Sunday:
                System.out.println("weekend");
                break;

        }

    }

}
