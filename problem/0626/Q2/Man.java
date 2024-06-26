package Q2;

public class Man extends Person {

    public int power;

    public Man(String name, int age, int power) {
        super(name, age);
        this.power = power;

    }
    public void run() {
        System.out.println(name + "이(가) 빠르게 달립니다.");
    }
}
