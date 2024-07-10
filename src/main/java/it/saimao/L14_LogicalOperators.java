package it.saimao;

/*
Logical AND (Both true then true)
true && true = true
false && true = false
true && false = false
false && false = false

Logical OR (Either true then true)
true || true = true
true || false = true
false || true = true
false || false = false

Logical NOT
!true = false
!false = true

 */
public class L14_LogicalOperators {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        boolean isGreater = x > y;
        boolean isLess = x < y;
        boolean and = isGreater && isLess;

        System.out.println(and);
        boolean or = x == y || x < y;
        System.out.println(or);

        boolean not = !(x == y || x < y);
        System.out.println(not);
    }
}
