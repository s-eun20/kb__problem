package Q2;

public class Main {
    public static void main(String[] args) {
        Superman superman = new Superman("클라크 켄트",30,100,true);

        superman.eat();
        superman.run();
        superman.space();
        System.out.println(superman.toString());
    }
}
