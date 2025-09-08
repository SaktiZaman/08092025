public class vehicle {
    String color;
    String brand;
    int milesPerGalon;


    public vehicle(String color, String brand, int milesPerGalon){
        this.color = color;
        this.brand = brand;
        this.milesPerGalon = milesPerGalon;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("milesPerGalon: " + milesPerGalon);
    }
}