package Q1;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String model,int numDoors) {
        super(brand, model);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }
    public void display() {
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Number of Doors: " + numDoors);
    }
}
