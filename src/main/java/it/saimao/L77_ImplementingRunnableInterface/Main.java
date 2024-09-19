package it.saimao.L77_ImplementingRunnableInterface;

public class Main {

    public static class Runner implements Runnable {
        @Override
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

    public static void main(String[] args) {
        System.out.println("Main thread start!");
        Thread th1 = new Thread(new Runner());
        th1.start();

        Thread th2 = new Thread(new Runnable() {
            @Override
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
        });
        th2.start();

        // Lambda expression
        Thread th3 = new Thread(() -> {
            boolean bool = true;
            while (bool) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Downloading..." + Thread.currentThread().getName());
            }
        });
        th3.start();

        System.out.println("Main thread end!");
    }
}
