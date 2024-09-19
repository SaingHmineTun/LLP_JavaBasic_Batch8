package it.saimao.L79_ThreadJoin;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("Main thread start!");
        Thread th1 = new Thread(() -> {
            for (int i = 0; i < 3; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Downloading " + (i + 1));
            }
        });
        th1.start();

        th1.join();
        System.out.println("Main thread end");

    }
}
