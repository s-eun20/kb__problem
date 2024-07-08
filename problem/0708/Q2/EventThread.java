package Q2;

public class EventThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Event " + i+">> Award Trophy");
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
