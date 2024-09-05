package it.saimao.L67_Record;

import java.util.Objects;

/*
1. create private final states
2. create constructors to initiate final states
3. create get methods to access final states' values
4. overwrite toString() method to query state's value
5. overwrite equals() method to compare two object
 */
public class Dog {

    private final String name;
    private final String sound;
    private final boolean male;

    public Dog(String name, boolean male) {
        this.name = name;
        this.sound = "Woof";
        this.male = male;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public boolean isMale() {
        return male;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", sound='" + sound + '\'' +
                ", male=" + male +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Dog dog = (Dog) object;
        return male == dog.male && Objects.equals(name, dog.name) && Objects.equals(sound, dog.sound);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sound, male);
    }
}
