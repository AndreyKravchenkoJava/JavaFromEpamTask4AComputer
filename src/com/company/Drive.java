package com.company;

import java.util.Objects;

public class Drive extends ComputerObject{
    private String work;

    public Drive(String name, int price, String work) {
        super(name, price);
        this.work = work;
    }

    public String getWork() {
        return work;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Drive drive = (Drive) o;
        return Objects.equals(work, drive.work);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), work);
    }

    @Override
    public String toString() {
        return super.toString() + "Drive: " + "work= " + work;
    }
}
