package it.saimao.L61_StaticInnerClass;

public class User {
    private String name;
    private int age;
    private String address;
    private String city;
    private double height;

    private User(String name, int age, String address, String city, double height) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.city = city;
        this.height = height;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", height=" + height +
                '}';
    }

    /*
    1) Intermediate method (chaining methods)
    2) Terminate method
     */
    public static class Builder {
        private String name;
        private int age;
        private String address;
        private String city;
        private double height;

        public User build() {
            return new User(name, age, address, city, height);
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder setCity(String city) {
            this.city = city;
            return this;
        }

        public Builder setHeight(double height) {
            this.height = height;
            return this;
        }

    }

}
