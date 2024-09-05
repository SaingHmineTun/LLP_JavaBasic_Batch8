package it.saimao.L53_Interface;

public class PlayStation {

    private GameConsole gameConsole;

    public PlayStation(GameConsole gameConsole) {
        this.gameConsole = gameConsole;
    }

    public void play() {
        gameConsole.up();
        gameConsole.down();
        gameConsole.left();
        gameConsole.right();
    }

}
