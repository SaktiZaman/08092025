public class vehicle {
    String color;
    String brand;
    int milesPerGalon;
    int numberOW;
    String type;


    public vehicle(String color, String brand, int milesPerGalon, int numberOW, String type){
        this.color = color;
        this.brand = brand;
        this.milesPerGalon = milesPerGalon;
        this.numberOW = numberOW;
        this.type = type;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("milesPerGalon: " + milesPerGalon);
        System.out.println("number of wheels: " + numberOW);
        System.out.println("Type: " + type);
    }
}