package Q1;

public class Main {
    public static void main(String[] args) {
        AppleComputer apple = new AppleComputer();


        System.out.println("애플컴퓨터-------------");
        apple.start();
        apple.shutdown();
        apple.restart();

        BananaComputer banana = new BananaComputer();

        System.out.println("바나나컴퓨터-------------");
        banana.start();
        banana.shutdown();
        banana.restart();
    }
}
