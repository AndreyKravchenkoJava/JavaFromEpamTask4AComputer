package com.company;

import java.util.ArrayList;
import java.util.Objects;

public class Computer {
    private String turnOnComputer;
    private String turnOffComputer;
    private ArrayList<ComputerObject> computerObjects;

    public Computer(String turnOnComputer, String turnOffComputer) {
        this.turnOnComputer = turnOnComputer;
        this.turnOffComputer = turnOffComputer;
        this.computerObjects = new ArrayList<>();
    }

    public String getTurnOnComputer() {
        return turnOnComputer;
    }
    public String getTurnOffComputer() {
        return turnOffComputer;
    }
    public ArrayList<ComputerObject> getComputerObject() {
        return computerObjects;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(turnOnComputer, computer.turnOnComputer) && Objects.equals(turnOffComputer, computer.turnOffComputer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(turnOnComputer, turnOffComputer);
    }

    @Override
    public String toString() {
        return "Computer{ " + "turnOnComputer= " + turnOnComputer + ", turnOffComputer= " + turnOffComputer + '\'' + ", \n   computerObjects= " + computerObjects + "\n}";
    }
}
