package it.saimao.L47_Encapsulation;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        String name = user.getName();
        System.out.println(name);

        user.setAge(-100);
        System.out.println(user.getAge());
        user.setName("     ");
        System.out.println(user.getName());

        String lower = user.getName().toLowerCase();
        System.out.println(lower); // empty string = null
    }
}
