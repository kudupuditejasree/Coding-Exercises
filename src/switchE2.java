public class switchE2 {
    static String dayOfWeek(String day){
        return switch (day){
            default -> {
                System.out.println("you entered:"+day);
                yield "invalid day";}
            case "monday","t","w","th","f"->"weekday";
            case "sa","su"->"weekend";


        };
    }

    public static void main(String[] args) {
        String res=dayOfWeek("T");
        System.out.println("it  is  "+res);
    }
}
