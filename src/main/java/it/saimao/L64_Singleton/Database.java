package it.saimao.L64_Singleton;
/*
1. private constructor
2. Create static state of current object
3. Create static method for object creation
 */
public class Database {

    private static Database database;

    private Database() {}

    public static Database getInstance() {
        if (database == null) {
            database = new Database();
        }
        return database;
    }


}
