import java.util.Scanner;

public class TrafficLightSimulation {
    static String TrafficLightSimul(String lightColor){
        return switch (lightColor){
            case "red"->"Stop";
            case "green"->"Go";
            case "yellow"->"slow down";
            default -> "invalid color";
        };
    }
    public static void main(String[] args) {
        System.out.println("enter traffic light colour:");
       // System.out.println(TrafficLightSimul("red"));
        Scanner scanner=new Scanner(System.in);
        String lightColor= scanner.nextLine();
        System.out.println(TrafficLightSimul(lightColor));


    }
}
