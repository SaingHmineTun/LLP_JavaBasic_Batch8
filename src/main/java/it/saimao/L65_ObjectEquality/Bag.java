package it.saimao.L65_ObjectEquality;

import java.util.Objects;

public class Bag {
    private String brand;
    private double price;
    private char color;

    public Bag(String brand, double price, char color) {
        this.brand = brand;
        this.price = price;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Bag bag = (Bag) object;
        return Double.compare(price, bag.price) == 0 && color == bag.color && Objects.equals(brand, bag.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, price, color);
    }
}
