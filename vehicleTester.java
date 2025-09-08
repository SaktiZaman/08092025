import java.util.Scanner;

public class vehicleTester {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter color of car");
        String col = x.nextLine();
        System.out.println("Enter brand of car");
        String br = x.nextLine();
        vehicle car = new vehicle(col, br, 10, 4, "car");
        car.display();

        vehicle bus = new vehicle("Red", "SinarJaya", 7, 8, "bus");
        bus.display();
    }
}
