package it.saimao.L80_ThreadSynchronization;

public class Main {
    public static void main(String[] args) {

        Main main = new Main();
        main.start();

    }

    private int counter;

    /*
    1. LOCK
    2. WORK
    3. UNLOCK
     */
    private synchronized void increment() {
        counter++;
    }

    private void incCounter() {
        synchronized (this) {
            counter++;
        }
        System.out.println("Hello!");
    }

    private void start() {

        class CustomThread extends Thread {
            @Override
            public void run() {
                for (int i = 0; i < 10_000; i++) {
                    incCounter();
                }
            }
        }
        var th1 = new CustomThread();
        th1.start();
        var th2 = new CustomThread();
        th2.start();
        var th3 = new CustomThread();
        th3.start();

        try {
            th1.join();
            th2.join();
            th3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter - " + counter);

    }
}
