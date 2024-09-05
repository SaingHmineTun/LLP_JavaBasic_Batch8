package it.saimao.L60_InnerClass;

public class Main {
    public static void main(String[] args) {


        Computer.RandomAccessMemory ram = new Computer("Lenovo", 'b').new RandomAccessMemory("DDR3", 8);
        ram.printRamInfo();

    }
}
