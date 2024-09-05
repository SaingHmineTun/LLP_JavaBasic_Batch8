package it.saimao.L53_Interface;

/*
1) class to class           extends
2) interface to interface   extends
3) class to interface       implements
 */
public class Main {
    public static void main(String[] args) {
        PlayStation playStation = new PlayStation(new SuperContra()); // loosely coupling
        playStation.play();
    }
}
