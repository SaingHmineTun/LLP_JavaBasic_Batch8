package it.saimao.L53_Interface;

public class SuperContra implements GameConsole {

    @Override
    public void up() {
        System.out.println("Jump");
    }

    @Override
    public void down() {
        System.out.println("Sit down");
    }

    @Override
    public void left() {
        System.out.println("Go back");
    }

    @Override
    public void right() {
        System.out.println("Shoot a bullet!");
    }
}
