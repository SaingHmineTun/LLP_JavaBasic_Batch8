package it.saimao.L39_MethodReturnType;

/*
1. method return type
2. method name
3. method parameter
4. method body
 */
public class Math {
    double first;
    double second;

    double add() {
        return first + second;
    }

    double divide() {
        System.out.println("Divide method is being called!");
        return first / second;
    }

}
