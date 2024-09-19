package it.saimao.L76_ExtendingThread;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main thread start - " + Thread.currentThread().getName());

        CustomThread customThread = new CustomThread();
        customThread.start(); // transfer responsibility

        System.out.println("Main thread end - " + Thread.currentThread().getName());

    }
}
