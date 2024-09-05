package it.saimao.L60_InnerClass;

// Outer class
public class Computer {
    private String brand;
    private char color;

    public Computer(String brand, char color) {
        this.brand = brand;
        this.color = color;
    }

    // Inner class
    public class RandomAccessMemory { // RAM
        private String model;
        private int size;

        public RandomAccessMemory(String model, int size) {
            this.model = model;
            this.size = size;
        }

        public void printRamInfo() {
            String info = String.format(
                    """
                            Computer Brand - %s
                            Color or computer - %c
                            Ram model - %s
                            Ram size - %d
                            """, brand, color, model, size);
            System.out.println(info);
        }
    }
}
