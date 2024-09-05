package it.saimao.L61_StaticInnerClass;

public class Main {
    public static void main(String[] args) {

        User user = new User.Builder().setHeight(5.3).setCity("Muse").setName("Sai").build();
        System.out.println(user);
    }
}
