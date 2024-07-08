package Q2;

public class Main {
    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        TimeThread timeThread = new TimeThread();
        EventThread eventThread = new EventThread();

        counterThread.start();
        timeThread.start();
        eventThread.start();
    }
}
