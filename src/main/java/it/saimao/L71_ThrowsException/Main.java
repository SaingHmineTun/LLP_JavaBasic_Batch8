package it.saimao.L71_ThrowsException;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        main.init();
    }

    private void init() throws InterruptedException {

        System.out.println("Init start");
        Thread.sleep(3000);
        System.out.println("Init end");

    }

}
