package com.company;

import java.util.Objects;

public class HardDrive extends ComputerObject{
    private int hardDriveSize;
    private String checkForVirus;

    public HardDrive(String name, int price, int hardDriveSize, String checkForVirus) {
        super(name, price);
        this.hardDriveSize = hardDriveSize;
        this.checkForVirus = checkForVirus;
    }

    public int getHardDriveSize() {
        return hardDriveSize;
    }
    public String getCheckForVirus() {
        return checkForVirus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        HardDrive hardDrive = (HardDrive) o;
        return Objects.equals(hardDriveSize, hardDrive.hardDriveSize) && Objects.equals(checkForVirus, hardDrive.checkForVirus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), hardDriveSize, checkForVirus);
    }

    @Override
    public String toString() {
        return super.toString() + "HardDrive: " + "hardDriveSize= " + hardDriveSize + ", checkForVirus= " + checkForVirus;
    }
}
