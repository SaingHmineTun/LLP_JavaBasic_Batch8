package it.saimao.L81_Generic;


public class Main {
    public static void main(String[] args) {

        User1 user1 = new User1();
        user1.name = "Sai  Luffy";
        user1.password = 1234;

        User2 user2 = new User2();
        user2.name = "Sai Zoro";
        user2.password = "1234";

        UserGeneric<Integer> userGeneric = new UserGeneric<>();
        userGeneric.name = "Sai Sanji";
        userGeneric.password = 1234;
        userGeneric.setPassword(123);
        userGeneric.getPassword();

        userGeneric.getString("String");
        userGeneric.getValue(true);

    }
}
