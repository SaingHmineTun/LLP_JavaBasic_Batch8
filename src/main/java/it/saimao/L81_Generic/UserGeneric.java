package it.saimao.L81_Generic;

public class UserGeneric<T> {
    String name;
    T password;

    T getPassword() {
        return password;
    }

    void setPassword(T password) {
        this.password = password;
    }

    String getString(String string) {
        return string;
    }

    <S> S getValue(S s) {
        return s;
    }


}
