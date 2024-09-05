package it.saimao.L64_Singleton;

public class Main {
    public static void main(String[] args) {

        Database database = Database.getInstance();
        Database database1 = Database.getInstance();
        System.out.println(database1 + " VS " + database);
        System.out.println(database1 == database);

    }
}
