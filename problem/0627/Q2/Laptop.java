package Q2;

public class Laptop extends Device{
    public Laptop(int batteryCapacity, String color) {
        super(batteryCapacity, color);
    }

    public void charge(int additionalCapacity) {
        int battery = getBatteryCapacity();
        battery += additionalCapacity;
    }

    public String toString() {
        return "Laptop{batteryCapacity="+getBatteryCapacity()+"} "+super.toString();
    }
}
