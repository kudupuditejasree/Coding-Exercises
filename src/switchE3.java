public class switchE3 {
    static String dayOfWeek(){
        enum Day{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
        Day day=Day.Sunday;
        return switch (day){
            case Monday,Tuesday,Wednesday,Thursday,Friday->"weekday";
            case Saturday,Sunday->"weekend";
            default ->"Invalid day";
        };
    }

    public static void main(String[] args) {
        String res=dayOfWeek();
        System.out.println("it  is  "+res);
    }
}
