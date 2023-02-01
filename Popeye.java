import java.util.Scanner;

public class PopeyeSailing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the distance to travel in nautical miles: ");
        double nauticalMiles = sc.nextDouble();
        System.out.print("Enter the top speed of the boat in knots: ");
        double topSpeed = sc.nextDouble();
        System.out.print("Enter the average speed of the boat in knots: ");
        double averageSpeed = sc.nextDouble();
        double regularMiles = nauticalMiles * 1.1508;
        double topSpeedTime = nauticalMiles / topSpeed;
        double averageSpeedTime = nauticalMiles / averageSpeed;
        System.out.println("The distance to travel in regular miles is: " + regularMiles + " miles");
        System.out.println("The best case travel time is: " + topSpeedTime + " hours at " + topSpeed + " knots");
        System.out.println("The average case travel time is: " + averageSpeedTime + " hours at " + averageSpeed + " knots");
    }
}
