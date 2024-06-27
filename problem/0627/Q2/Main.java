package Q2;

public class Main {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone(80,"red",20);
        Tablet tablet = new Tablet(70,"blue",false);
        Laptop laptop = new Laptop(100,"sliver");


        System.out.println(phone.toString());
        System.out.println(tablet.toString());
        System.out.println(laptop.toString());

    }
}
