package com.company;

import java.util.Objects;

public class Cpu extends ComputerObject{
    private int numbersOfCores;

    public Cpu(String name, int price, int numbersOfCores) {
        super(name, price);
        this.numbersOfCores = numbersOfCores;
    }

    public int getNumbersOfCores() {
        return numbersOfCores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cpu cpu = (Cpu) o;
        return Objects.equals(numbersOfCores, cpu.numbersOfCores);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numbersOfCores);
    }

    @Override
    public String toString() {
        return super.toString() + "Cpu: " + "numbersOfCores= " + numbersOfCores;
    }
}
