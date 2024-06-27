package Q2;

public class Smartphone extends Device{
    private int cameraResolution;

    public Smartphone(int batteryCapacity, String color,int cameraResolution) {
        super(batteryCapacity, color);
        this.cameraResolution = cameraResolution;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }
    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }
    public String toString() {
        return "Smartphone {cameraResolution=" + cameraResolution + ", batteryCapacity=" + getBatteryCapacity() +  "} " + super.toString();
    }
}
