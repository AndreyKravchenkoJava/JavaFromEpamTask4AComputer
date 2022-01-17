package com.company;

import com.company.Computer;
import com.company.ComputerObject;

import java.util.ArrayList;

public class Utils {
    public static void ComputerToString(Computer computer) {
        System.out.println("Computer: turnOnComputer= " + computer.getTurnOnComputer() + ", turnOffComputer= " + computer.getTurnOffComputer());
        System.out.println("[ ComputerObjects");
        listComputerObjectsToString(computer.getComputerObject());
        System.out.println("]");
    }

    public static void listComputerObjectsToString(ArrayList<ComputerObject> list) {
        String result = "";
        for (int i = 0; i < list.size(); i++) {
            result += "" + list.get(i) + "\n";
        }
        System.out.println(result);
    }
}
