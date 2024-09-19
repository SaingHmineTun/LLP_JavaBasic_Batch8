package it.saimao.L75_Thread;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread start");
        boolean bool = true;
        while (bool) {
            Thread.sleep(1000);
            System.out.println("Running");
        }
        System.out.println("Main thread end");
    }

}
