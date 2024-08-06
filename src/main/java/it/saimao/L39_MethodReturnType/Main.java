package it.saimao.L39_MethodReturnType;

public class Main {
    public static void main(String[] args) {
//        Math math = new Math();
//        math.first = 5;
//        math.second = 10;
//        double add = math.add();
//        System.out.println(add);
//        System.out.println(math.divide());

        StringCase stringCase = new StringCase();

        stringCase.string = "Hello World";
        System.out.printf("Lowercase - " + stringCase.toLowerCase() + "\n");
        System.out.print("Uppercase - " + stringCase.toUpperCase() + "\n");

    }
}
