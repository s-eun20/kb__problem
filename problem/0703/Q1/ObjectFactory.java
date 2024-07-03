package Q1;

public class ObjectFactory {
    public Object createObject(String objectType) {
        if (objectType.equalsIgnoreCase("Apple")) {
            return new AppleClass();
        } else if (objectType.equalsIgnoreCase("Banana")) {
            return new BananaClass();
        } else if (objectType.equalsIgnoreCase("Ice")) {
            return new IceClass();
        }
        return null;
    }
}
