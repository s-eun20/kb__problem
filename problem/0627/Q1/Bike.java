package Q1;

public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, String model,boolean hasCarrier) {
        super(brand, model);
        this.hasCarrier = hasCarrier;
    }

    public boolean getHasCarrier() {
        return hasCarrier;
    }

    public void display() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Has Carrier: " + hasCarrier);
    }
}
