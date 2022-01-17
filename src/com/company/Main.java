package com.company;

import com.company.Computer;
import com.company.ComputerObject;
import com.company.ComputerObjectRepository;
import com.company.Utils;
import com.company.HardDrive;
import com.company.ComputerObjectService;
import com.company.ConsoleUi;
import com.company.Ram;
import com.company.Drive;
import com.company.Cpu;

public class Main {

    public static void main(String[] args) {
        Computer computer = new Computer("Computer on", "Computer off");
        ComputerObject Cpu = new Cpu("Ryzen 5 2600", 200, 8);
        ComputerObject Ram = new Ram("hyperX", 100, 16);
        ComputerObject Drive = new Drive("Asus", 80, "Yes");
        ComputerObject HardDrive = new HardDrive("Kingstone", 100, 1000, "No");
        computer.getComputerObject().add(Cpu);
        computer.getComputerObject().add(Ram);
        computer.getComputerObject().add(Drive);
        computer.getComputerObject().add(HardDrive);

        ComputerObjectRepository computerObjectRepository = new ComputerObjectRepository(computer.getComputerObject());
        ComputerObjectService computerObjectService = new ComputerObjectService(computerObjectRepository);
        ConsoleUi consoleUi = new ConsoleUi(computerObjectService, computer);

        consoleUi.run();
    }
}
