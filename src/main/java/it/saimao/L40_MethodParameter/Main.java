package it.saimao.L40_MethodParameter;

public class Main {
    public static void main(String[] args) {
//        Calculator calculator = new Calculator();
//        System.out.println(calculator.add(5, 10));

        StringEqual stringEqual = new StringEqual();
        boolean isEqual = stringEqual.isEquals("One", "One");
        System.out.println("is equals => " + isEqual);

    }
}
