package it.saimao.L47_Encapsulation;

public class User {
    private String name;
    private int age;

    // get method / getter
    public String getName() {
        if (name == null) return "";
        return name;
    }

    // allow read access
    public int getAge() {
        return age;
    }

    // set method / setter
    public void setName(String name) {
        if (!name.isBlank() && name.length() > 5)
            this.name = name;
    }

    public void setAge(int age) {
        if (age > 0)
            this.age = age;
    }

}
