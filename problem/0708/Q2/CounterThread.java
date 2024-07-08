package Q2;

public class CounterThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("CounterThread: " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
