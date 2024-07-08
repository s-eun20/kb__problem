package Q2;

import java.util.Date;

public class TimeThread extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            Date date = new Date();
            System.out.println("Current Time: "+date);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
