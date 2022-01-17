package com.company;

import com.company.Computer;
import com.company.ComputerObject;

import java.util.ArrayList;

public class ComputerObjectRepository {
    private ArrayList<ComputerObject> computerObjects;

    public ComputerObjectRepository(ArrayList<ComputerObject> computerObjects) {
        this.computerObjects = computerObjects;
    }

    public HardDrive getHardDrive() {
        for (int i = 0; i < computerObjects.size(); i++) {
            if (computerObjects.get(i).getClass().equals(HardDrive.class)) {
                return (HardDrive) computerObjects.get(i);
            }
        }
        return null;
    }
}
