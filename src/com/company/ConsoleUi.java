package com.company;

import java.util.Scanner;

public class ConsoleUi {
    private ComputerObjectService computerObjectService;
    private Computer computer;
    private Scanner scanner;

    public ConsoleUi(ComputerObjectService computerObjectService, Computer computer) {
        this.computerObjectService = computerObjectService;
        this.computer = computer;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            init();
        }
    }

    private void init() {
        helloMessage();
        String choice = getChoiceOneChar();
        switch (choice) {
            case "n": {
                runMethodGetOnComputer();
                break;
            }
            case "f": {
                runMethodGetOffComputer();
                break;
            }
            case "v": {
                runMethodGetVirusComputer();
                break;
            }
            case "s": {
                runMethodGetSizeHardDrive();
                break;
            }
            case "t": {
                runMethodGetComputerToString();
                break;
            }
            case "x": {
                System.out.println("Thanks for using this program. Goodbye");
                System.exit(0);
            }
            default: {
                System.out.println("Your input wrong choice!");
            }
        }
    }

    private void runMethodGetOnComputer() {
        String onComputer = computer.getTurnOnComputer();
        System.out.println("Computer " + onComputer);
    }

    private void runMethodGetOffComputer() {
        String offComputer = computer.getTurnOffComputer();
        System.out.println("Computer " + offComputer);
    }

    private void runMethodGetVirusComputer() {
        String virus = computerObjectService.getHardDrive().getCheckForVirus();
        System.out.println("Check for virus: " + virus);
    }

    private void runMethodGetSizeHardDrive() {
        int size = computerObjectService.getHardDrive().getHardDriveSize();
        System.out.println("Size HardDrive= " + size);
    }

    private void runMethodGetComputerToString() {
        Utils.ComputerToString(computer);
    }

    private String getChoiceOneChar() {
        return String.valueOf(scanner.next().trim().charAt(0));
    }

    private void helloMessage() {
        System.out.println("-------------------------------------------");
        System.out.println("Please input char to choice function");
        System.out.println("n - on computer");
        System.out.println("f - off computer");
        System.out.println("v - check for virus");
        System.out.println("s - get size hardDrive");
        System.out.println("t - computer to string");
        System.out.println("x - exit");
    }
}
