package Q2;

public class Tablet extends Device {
    private boolean isConnected;

    public Tablet(int batteryCapacity, String color,boolean isConnected) {
        super(batteryCapacity, color);
        this.isConnected=isConnected;
    }

    public boolean getIsConnected() {
        return isConnected;
    }
    public void setIsConnected(boolean status) {
        this.isConnected = status;
    }
    public String toString() {
        return "Tablet {isConnected=" + isConnected + ", batteryCapacity="+getBatteryCapacity()+"} "+super.toString();
    }
}
