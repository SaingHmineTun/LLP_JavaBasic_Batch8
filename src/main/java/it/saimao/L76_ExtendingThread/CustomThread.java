package it.saimao.L76_ExtendingThread;

public class CustomThread extends Thread {

    public void run() {

        boolean bool = true;
        while (bool) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Downloading..." + Thread.currentThread().getName());
        }

    }
}
