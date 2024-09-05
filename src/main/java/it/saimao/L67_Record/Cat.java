package it.saimao.L67_Record;

/*
1. create private final states
2. create constructors to initiate final states
3. create get methods to access final states' values
4. overwrite toString() method to query state's value
5. overwrite equals() method to compare two object
 */
public record Cat(String name, String sound, boolean male) {
}
