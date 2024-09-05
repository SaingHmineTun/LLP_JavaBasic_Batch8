package it.saimao.L55_Static;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("Sai"); //
        User.incCounter();
        User user2 = new User("Nan");
        User.incCounter();
        User user3 = new User("Ko");
        User.incCounter();
        User user4 = new User("Ma");
        User.incCounter();
        System.out.println(user1.getName() + user2.getName() + user3.getName() + user4.getName());
        System.out.println("" + user1.getCounter() + user2.getCounter() + user3.getCounter() + user4.getCounter());
    }
}
