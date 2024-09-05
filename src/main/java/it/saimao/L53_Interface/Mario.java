package it.saimao.L53_Interface;

public class Mario implements GameConsole {

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Get into the hole");
    }

    @Override
    public void left() {
        System.out.println("Go backward");
    }

    @Override
    public void right() {
        System.out.println("Move forward");
    }
}
