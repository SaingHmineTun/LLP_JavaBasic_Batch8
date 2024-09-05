package it.saimao.L55_Static;
/*
instance member relates to single object
static member relates to all objects
 */
public class User {

    public static int counter;

    public static void incCounter() {
        counter ++;
    }

    public int getCounter() {
        return counter;
    }

    public User(String name) {
        this.name = name;
    }

    private String name; // instance variable

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
