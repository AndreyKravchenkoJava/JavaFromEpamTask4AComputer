package com.company;

import java.util.Objects;

public class ComputerObject {
    private String name;
    private int price;

    public ComputerObject(String name, int price)  {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComputerObject computerObject = (ComputerObject) o;
        return Objects.equals(name, price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "name= " + name + ", price= " + price + "', ";
    }
}
