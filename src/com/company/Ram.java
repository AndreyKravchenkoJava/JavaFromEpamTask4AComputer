package com.company;

import java.util.Objects;

public class Ram extends ComputerObject{
    private int amountMemory;

    public Ram(String name, int price, int amountMemory) {
        super(name, price);
        this.amountMemory = amountMemory;
    }

    public int getAmountMemory() {
        return amountMemory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Ram ram = (Ram) o;
        return Objects.equals(amountMemory, ram.amountMemory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), amountMemory);
    }

    @Override
    public String toString() {
        return super.toString() + "Ram: " + "amountOfMemory= " + amountMemory;
    }
}
